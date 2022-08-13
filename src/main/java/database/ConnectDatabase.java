package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaitey
 */
public class ConnectDatabase extends Thread {

    private static Connection connection;
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://remotemysql.com:3306/OKnnb7qJPl";
    private static final String USERNAME = "OKnnb7qJPl";
    private static final String PASSWORD = "1w0A6DCMzq";
    private static final String MAX_POOL = "250"; // set your own limit

    public static Connection getConnection() throws ClassNotFoundException, SQLException, InterruptedException {
        if (connection == null) {
            Class.forName(DATABASE_DRIVER);
            new ConnectDatabase().start();
        }
        while(connection==null){
            Thread.sleep(1000);
        }
        if(connection.isClosed()){
            return getConnection();
        }
        
        return connection;
    }
    @Override 
    public void run(){
        try {
            connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
