/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DataBase {
    private String DATABASE_URL = "jdbc:derby://localhost:1527/MAdb";
    private String username = "java";
    private String password = "java";
    private String driver ="apache_derby_net";
    private Connection connection;
    private Statement statement;
    private ResultSet resultCus;
    private ResultSet resultHol;
    private ResultSet resultMag;
    
    
    
    private String RequestedHoliday;
    
    private ArrayList<String> holidayArr = new ArrayList<>(100);
    private ArrayList<String> waitArrayList = new ArrayList<>(100);
    
    public DataBase(){
        try {
            try {
                try {
                    Class.forName(driver).newInstance();
                } catch (InstantiationException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
            connection = DriverManager.getConnection(DATABASE_URL, username, password);
            
            statement = connection.createStatement();
            statement.close();
//            
//            String query1 = "SELECT * FROM CUTOMER";
//            String query2 = "SELECT * FROM MAGICIAN";
//            String query3 = "SELECT * FROM HOLIDAY";
//            
//            resultCus = statement.executeQuery(query1);
//            resultset = statement.executeQuery(query2);
//            resultset = statement.executeQuery(query3);
//            
//            
//            
//            ResultSetMetaData metaData = resultset.getMetaData();
//            while(resultset.next())
//            {
//                waitArrayList.add(resultset.getString("CUSTOMER"));
//            }
//            resultset.close();
//            statement.close();
        }
         catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertMagician(String name) throws SQLException{
        String query = "INSERT INTO MAGICIAN (NAME) VALUES ('DAVID')"; 
        PreparedStatement addNewMagician 
                    = connection.prepareStatement("INSERT INTO MAGICIAN (NAME) VALUES ?");
            addNewMagician.setString(1, name);
            addNewMagician.executeUpdate();
    }
}
