/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.basic.databasehelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author turker
 */
public class BasicDataBaseHelper {

   
    
    public static void main(String[] args) throws SQLException  {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        try {
            connection = helper.connection();
            System.out.println("connection successful");        
        } catch (SQLException e) {
            helper.showErrorMessage(e);
        }
        finally{
            connection.close();
        }

        
    }
}
