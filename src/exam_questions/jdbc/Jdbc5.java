package exam_questions.jdbc;

import java.sql.*;

public class Jdbc5 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306" +
                    "/my_db?allowPublicKeyRetrieval=true&useSSL=false", "sveta", "sveta");
            String query = "Select * FROM EMPLOYEE2";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) { //Line 12
                System.out.println("ID: " + rs.getInt("ID"));
                System.out.println("First Name: " + rs.getString("FIRSTNAME"));
                System.out.println("Last Name: " + rs.getString("LASTNAME"));
                System.out.println("Salary: " + rs.getDouble("SALARY"));
            }
            rs.close(); //Line 18
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //Even if there are no records in EMPLOYEE table, ResultSet object returned by
        // 'stmt.executeQuery(query);' will never be null.
        //
        //rs.next() returns false and control doesn't enter while loop. Code executes
        // fine and doesn't print anything on to the console.
    }
}
