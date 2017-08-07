/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Skills;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pauldelgado
 */
public class SkillsDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    private Statement statement;
    
    public List<Skills> getSkills()
    {
        Skills skill = null;
        List<Skills> list = new ArrayList<Skills>();
        
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query = "select * from skills";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                skill = new Skills();
                skill.setId(result.getString("id"));
                skill.setName(result.getString("name"));
                list.add(skill);
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
