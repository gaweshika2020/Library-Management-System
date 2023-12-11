/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");         
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","1234");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
