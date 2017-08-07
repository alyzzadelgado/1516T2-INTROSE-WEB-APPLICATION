/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Language;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pauldelgado
 */
public class LangDAO {
    
    private Connection connection;
    private DBConnectionFactory factory;
    private Statement statement;
    
    public List<Language> getLanguage()
    {
        Language lang = null;
        List<Language> list = new ArrayList<Language>();
        
        try {
            factory = DBConnectionFactory.getInstance();
            connection = factory.getConnection();
            statement = connection.createStatement();
            
            String query = "select * from languages";
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                lang = new Language();
                lang.setId(result.getString("id"));
                lang.setName(result.getString("name"));
                list.add(lang);
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
