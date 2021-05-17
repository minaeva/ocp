package exam_questions.jdbc;

//    Given structure of EMPLOYEE table:
//
//    EMPLOYEE (ID integer, FIRSTNAME varchar(100),
//    LASTNAME varchar(100), SALARY real, PRIMARY KEY (ID))


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306" +
                "/my_db?allowPublicKeyRetrieval=true&useSSL=false",
                "sveta", "sveta")) {
            connection = con;
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(101, 'John', 'Smith', 12000)");
        stmt.close();
        }
        connection.close();
    }
}
