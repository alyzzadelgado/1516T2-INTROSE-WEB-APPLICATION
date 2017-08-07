/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Proficiency;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pauldelgado
 */
public class ProfDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    private Statement statement;
    
    public List<Proficiency> getProficiency()
    {
        Proficiency prof = null;
        List<Proficiency> list = new ArrayList<Proficiency>();
        
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query = "select * from proficiencies";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                prof = new Proficiency();
                prof.setId(result.getString("id"));
                prof.setName(result.getString("name"));
                list.add(prof);
            }
            
        result.close();
        statement.close();
        connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
