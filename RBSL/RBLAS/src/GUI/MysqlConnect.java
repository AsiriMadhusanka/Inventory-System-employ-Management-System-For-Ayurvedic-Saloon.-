/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author TITANIUM
 */
import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
    Connection conn = null;
    
    public static Connection ConnectDB(){
    
        try {
                          //com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");  //loading the driver
               
          
            //Establishing a Connection                               / /URL //Port No://DB Name//UID//Password
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rblas","root","");
                                                          
          //  JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    
     } //End ConnectDB Method Here
    
    } //End MysqlConnect Class Here
