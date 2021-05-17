package exam_questions.jdbc;

import java.sql.*;

public class Jdbc4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_db?allowPublicKeyRetrieval" +
                "=true&useSSL=false";
        String user = "sveta";
        String password = "sveta";
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE WHERE " +
                "SALARY > 14000 ORDER BY ID";

        try (Connection con = DriverManager.getConnection(url, user, password); Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); ResultSet rs = stmt.executeQuery(query);) {
            rs.absolute(2);
            rs.updateDouble("SALARY", 20000); //db is not changed
//            rs.updateRow(); //db is changed
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
    //'rs.updateDouble("SALARY", 20000);' updates the salary of 2nd record to 20000
    // but to update the records in the database, 'rs.updateRow();' statement
    // must be invoked.
}

/*
    Given structure of EMPLOYEE table:
        EMPLOYEE (ID integer, FIRSTNAME varchar(100), LASTNAME varchar(100),
        SALARY real, PRIMARY KEY (ID))

        EMPLOYEE table contains below records:
        101 John Smith 12000
        102 Sean Smith 15000
        103 Regina Williams 15500
        104 Natasha George 14600
 */
