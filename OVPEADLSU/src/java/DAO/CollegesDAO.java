/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Colleges;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pauldelgado
 */
public class CollegesDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    private Statement statement;
    
    public List<Colleges> getColleges()
    {
        Colleges college = null;
        List<Colleges> list = new ArrayList<Colleges>();
        
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query = "select * from colleges";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                college = new Colleges();
                college.setId(result.getString("id"));
                college.setName(result.getString("name"));
                list.add(college);
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
