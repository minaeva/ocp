package exam_questions.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/ocp";
        String user = "root";
        String password = "password";
        String query = "DELETE FROM MESSAGES";
        try (Connection con = DriverManager.getConnection(url, user, password);
             Statement stmt = con.createStatement()) {
            System.out.println(stmt.execute(query));
            //false
        }

        //execute(String) method of Statement can accept all types of queries. It
        // returns true if the first result is a ResultSet object; false if it is an
        // update count or there are no results.
        //
        //DELETE sql query returns the no. of deleted records, which is not a ResultSet
        // hence record is deleted from the database and false is returned.
    }
}
