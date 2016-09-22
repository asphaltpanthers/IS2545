/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightSim.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AsphaltPanthers
 */
public class SqlContext {
    private final Connection _connection;
    
    private final String _url = "jdbc:mysql://localhost:3306/testdb";
    private final String _user = "testuser";
    private final String _password = "test623";
    
    public SqlContext() throws SQLException { //Don't do this in the real world. Not good practice.
        _connection = DriverManager.getConnection(_url, _user, _password);
    }
    
    public <T> T ExecuteQuery(String query) throws SQLException { //Don't do this in the real world. Not good practice.
        Statement statement = _connection.createStatement();
        ResultSet set = statement.executeQuery(query);
        
        //Missing code.
        //Here I would serialize the ResultSet into an object of type T.
        //Were just going to mock this so I'm notactually going to do this.
        
        //Here you would return the serialized object.
        //Instead I'm just going to return null.
        //Again, were going to mock this so it doesn't really matter.
        return null;
    }
}
