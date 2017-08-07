/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.OppItems;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author pauldelgado
 */
public class OppItemDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    private Statement statement;
    
    public void add(OppItems oppItem) {
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();

            String query = "insert into opportunity_item (opp_id, item_id) values (?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, oppItem.getOppId());
            pstmt.setString(2, oppItem.getItemId());
            pstmt.executeUpdate();
            statement.close();
            connection.close();
        } 
        catch (Exception e) {
          e.printStackTrace();
        }
    }
    
    public void deleteItem (int id)
    {
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query = "delete from opportunity_item where opp_id =  " + id + "";
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
