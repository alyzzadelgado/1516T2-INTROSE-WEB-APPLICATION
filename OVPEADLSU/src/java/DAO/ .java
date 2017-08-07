/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Opportunity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author pauldelgado
 */
public class OppDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    private Statement statement;
    
    public Opportunity add(Opportunity opp) {
        
        ResultSet result = null;
        int id=0;
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            
            String query = "insert into opportunity (name, type, country, description, start_date, end_date, contact_person, contact_number, contact_landline, email, status, age, degree, work_experience, field_experience, skills, language, proficiency, requirements, type_name)"
                    + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            pstmt.setString(1, opp.getName());
            pstmt.setString(2, opp.getType());
            pstmt.setString(3, opp.getCountry());
            pstmt.setString(4, opp.getDescription());
            pstmt.setString(5, opp.getStartDate());
            pstmt.setString(6, opp.getEndDate());
            pstmt.setString(7, opp.getContactPerson());
            pstmt.setString(8, opp.getPhoneNum());
            pstmt.setString(9, opp.getLandline());
            pstmt.setString(10, opp.getEmail());
            pstmt.setString(11, opp.getStatus());
            pstmt.setString(12, opp.getAge());
            pstmt.setString(13, opp.getDegree());
            pstmt.setInt(14, opp.getWorkExp());
            pstmt.setString(15, opp.getFieldExp());
            pstmt.setString(16, opp.getOtherSkills());
            pstmt.setString(17, opp.getOtherLang());
            pstmt.setString(18, opp.getOtherProf());
            pstmt.setString(19, opp.getOtherReq());
            pstmt.setString(20, opp.getTypeName());
            pstmt.executeUpdate();
            
            result = pstmt.getGeneratedKeys();
            if(result.next()){
              id = result.getInt(1);  // gets opportunity id
            }
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return this.find(id);
    }
    
    public Opportunity find(int id){
      
      Opportunity newOpp = new Opportunity();
      
      try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            
            String query = "select * from opportunity where id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            ResultSet result = pstmt.executeQuery();
            if(result.next()){ 
                newOpp.setId(id);
                newOpp.setName(result.getString("name"));
                newOpp.setType(result.getString("type"));
                newOpp.setTypeName(result.getString("type_name"));
                newOpp.setCountry(result.getString("country"));
                newOpp.setDescription(result.getString("description"));
                newOpp.setStartDate(result.getString("start_date"));
                newOpp.setEndDate(result.getString("end_date"));
                newOpp.setContactPerson(result.getString("contact_person"));
                newOpp.setPhoneNum(result.getString("contact_number"));
                newOpp.setLandline(result.getString("contact_landline"));
                newOpp.setEmail(result.getString("email"));
                newOpp.setStatus(result.getString("status"));
                newOpp.setAge(result.getString("age"));
                newOpp.setDegree(result.getString("degree"));
                newOpp.setWorkExp(result.getInt("work_experience"));
                newOpp.setFieldExp(result.getString("field_experience"));
                newOpp.setOtherSkills(result.getString("skills"));
                newOpp.setOtherLang(result.getString("language"));
                newOpp.setOtherProf(result.getString("proficiency"));
                newOpp.setOtherReq(result.getString("requirements"));
            }
            connection.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return newOpp;
   }
    
    public void editStatus(Opportunity currOpp)
    {
        String query = null;
        if (currOpp.getStatus().equals("close")) {
            query = "update opportunity set end_date = now(), status = '"+currOpp.getStatus()+"' where id = "+currOpp.getId()+"";
        }
        else {
            query = "update opportunity set end_date = '"+currOpp.getEndDate()+"', status = '"+currOpp.getStatus()+"' where id = "+currOpp.getId()+"";
        }
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            statement.executeUpdate(query);
            statement.close();
            connection.close();
            //return true;
        } catch(Exception e)
        {
            e.printStackTrace();
        }
        //return false;
    }
    
    public boolean editOpp(Opportunity currOpp)
    {
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query = "update opportunity set name = '" + currOpp.getName() + "', type = '" + currOpp.getType() + "', type_name = '" + currOpp.getTypeName()+ "', country = '" + currOpp.getCountry() + "', description = '" + currOpp.getDescription() + "', start_date = '" + currOpp.getStartDate() + "', end_date = '" + currOpp.getEndDate() + "', contact_person = '" + currOpp.getContactPerson() + "', contact_number = '" + currOpp.getPhoneNum() + "', contact_landline = '" + currOpp.getLandline() + "', email = '" + currOpp.getEmail() + "', age = '" + currOpp.getAge() +"', degree = '" + currOpp.getDegree() + "', work_experience = '" + currOpp.getWorkExp() + "', field_experience = '" + currOpp.getFieldExp() + "', skills = '" + currOpp.getOtherSkills() + "', language = '" + currOpp.getOtherLang() + "', proficiency = '" + currOpp.getOtherProf() + "', requirements = '" + currOpp.getOtherReq() + "'"
                + " where id = '" + currOpp.getId() + "'";
            
            statement.executeUpdate(query);
            statement.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public void deleteOpp (int id)
    {
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query1 = "delete from opportunity_item where opp_id =  " + id + "";
            statement.executeUpdate(query1);
            
            String query2 = "delete from opportunity where id =  " + id + "";
            statement.executeUpdate(query2);
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
