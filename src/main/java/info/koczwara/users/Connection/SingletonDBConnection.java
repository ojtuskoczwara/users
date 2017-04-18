package info.koczwara.users.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SingletonDBConnection {
    private static SingletonDBConnection instance = new SingletonDBConnection();

    private Connection con;

    private SingletonDBConnection() {
    }

    public static SingletonDBConnection getInstance() {
        return instance;
    }
/*
    public Connection getConnection() {
        return con;
    }
*/
    public Connection connect() throws Exception {
        if (con != null)
            return con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new Exception("Driver not found");
        }
        String url = String.format("jdbc:mysql://localhost:3306/mojaBaza"+"?verifyServerCertificate=false&useSSL=true");
        con = DriverManager.getConnection(url,"tutorial","password");
        return con;
    }

    public void disconnect() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }

        con = null;
    }
}
