/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import classes.User;

/**
 *
 * @author alydoubleza
 */
public class RMDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    
    public User login (User user){
       
        ResultSet result = null;
        int id = 0;
        
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            
            String query = "select * from resmanager where username = ? and password = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            result = pstmt.executeQuery();
            while(result.next()) {
              id = result.getInt("rm_id");
            }
            
            result.close();
            pstmt.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return find(id);
    }
    
    public User find(int id) {
      
      User user = new User();
      ResultSet result = null;
      
      try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            
            String query = "select * from resmanager where rm_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            result = pstmt.executeQuery();
            if(result.next()){ 
                user.setUserid(id);
                user.setUsername(result.getString("username"));
                user.setPassword(result.getString("password"));
                user.setAccountName(result.getString("account_name"));
            }
            
            this.setLastLogin(user);
            
            result.close();
            pstmt.close();
            connection.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        return user;
   }
    
    public void setLastLogin (User currUser)
    {
        try
            {
                factory = DBConnectionFactory.getInstance();
                connection = factory.getConnection();
                
                String query = "update resmanager set last_login = now() where username = ? and password = ?";
                PreparedStatement pstmt = connection.prepareStatement(query);
                pstmt.setString(1, currUser.getUsername());
                pstmt.setString(2, currUser.getPassword());
                pstmt.executeUpdate();
            
                connection.close();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
    }
    
    public boolean validateCharacters (String newUsername) {
        char [] uArray= newUsername.toCharArray();
        int ascii;
        for(int i=0;i<newUsername.length();i++) {
           
            ascii = uArray[i];
            
            if(!(ascii>=48&&ascii<=57||ascii>=65&&ascii<=90||ascii>=97&&ascii<=122)) {
                return false;
            }
        }
        return true;
        
    } 
    
    public boolean editUsername (String newUsername, User user)
    {
        
        ResultSet result = null;
        String stringSet =null;
        try
            {
                factory = DBConnectionFactory.getInstance();
                connection = factory.getConnection();
                
                
                String check ="SELECT username FROM resmanager";
                PreparedStatement pstmt2 = connection.prepareStatement(check);
                result=pstmt2.executeQuery();
                while(result.next()) {
                    stringSet=result.getString("username");
                    if(stringSet.equals(newUsername)){
                        return false;
                    }
                }
                String query = "UPDATE resmanager SET username = ? WHERE rm_id = ?";
                PreparedStatement pstmt1 = connection.prepareStatement(query);
                pstmt1.setString(1, newUsername);
                pstmt1.setString(2, String.valueOf(user.getUserid()));
                pstmt1.executeUpdate();
                
                connection.close();
                return true;
            } catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
    }
    
    
    
    public boolean confirmPassword(String password, User user) {
        ResultSet result = null;
        String s1 = null;
        String nos1 = null;
        String nos2 = null;
        String s2 = null;
        try
            {
                factory = DBConnectionFactory.getInstance();
                connection = factory.getConnection();
                
                
                String check ="SELECT password FROM resmanager WHERE rm_id= ?";
                PreparedStatement pstmt2 = connection.prepareStatement(check);
                pstmt2.setString(1,String.valueOf(user.getUserid()));
                result=pstmt2.executeQuery();
                while(result.next()) {
                    nos1 = result.getString("password");
                    nos2 = password;
                    s1=result.getString("password");
                    s2=String.valueOf(password.hashCode());
                    if(result.getString("password").equals(String.valueOf(password.hashCode()))){
                        return true;
                    }
                }
                
                connection.close();
                return false;
            } catch (Exception e)
            {
                e.printStackTrace();
                return false;
            }
    }
    
    public String editPassword(String newPass, User user){
        
        try
            {
                factory = DBConnectionFactory.getInstance();
                connection = factory.getConnection();
                
                
                String query = "UPDATE resmanager SET password = ? WHERE rm_id = ?";
                PreparedStatement pstmt1 = connection.prepareStatement(query);
                pstmt1.setString(1, String.valueOf(newPass.hashCode()));
                pstmt1.setString(2, String.valueOf(user.getUserid()));
                pstmt1.executeUpdate();
                
                connection.close();
                return null;
            } catch (Exception e)
            {
                e.printStackTrace();
                return e.getMessage();
            }
    }
    
    
}
