/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Requirement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pauldelgado
 */
public class ReqDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    private Statement statement;
    
    public List<Requirement> getRequirement()
    {
        Requirement req = null;
        List<Requirement> list = new ArrayList<Requirement>();
        
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query = "select * from requirements";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                req = new Requirement();
                req.setId(result.getString("id"));
                req.setName(result.getString("name"));
                list.add(req);
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
