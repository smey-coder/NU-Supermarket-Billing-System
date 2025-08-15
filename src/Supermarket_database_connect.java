import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Supermarket_database_connect {
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=Supermarket Billing System_Assignment_Java;encrypt=true;trustServerCertificate=true;";
    private final String user = "sa";
    private final String password = "hello";

    public Connection supermarketDatabase() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("SQL Server Driver not found!");
            ex.printStackTrace();
            return null;
        }
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("Connected Successfully!");
        return conn;
    }
}
