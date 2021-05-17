package exam_questions.jdbc;

//    Given structure of EMPLOYEE table:
//
//            EMPLOYEE (ID integer, FIRSTNAME varchar(100), LASTNAME varchar(100),
//            SALARY real, PRIMARY KEY (ID))
//
//            101 John Smith 12000
//            102 Sean Smith 15000
//            103 Regina Williams 15500
//            104 Natasha George 14600


import java.sql.*;

public class Jdbc6 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/my_db?allowPublicKeyRetrieval" +
                "=true&useSSL=false";
        String user = "sveta";
        String password = "sveta";
        String query = "Select ID, FIRSTNAME, LASTNAME, SALARY FROM EMPLOYEE ORDER BY ID";
        try (Connection con = DriverManager.getConnection(url, user, password); Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);) {
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("before You are now in: " + rs.getRow());
            rs.last();
            System.out.println("last You are now in: " + rs.getRow());
            rs.first();
            System.out.println("first You are now in: " + rs.getRow()); //1

            rs.absolute(2);
            System.out.println("rs.absolute(2) - You are now in: " + rs.getRow()); //2

            // Move 2 records forward from the current position
            // (fourth row)
            rs.relative(2);
            System.out.println("relative 2 You are now in: " + rs.getRow()); //4

            rs.relative(2);
            System.out.println("relative 2 again - You are now in: " + rs.getRow()); //0

            rs.relative(2);
            System.out.println("relative 2 You are now in: " + rs.getRow()); //0
            rs.relative(3);
            System.out.println("relative 3 You are now in: " + rs.getRow()); //0
            rs.relative(2);
            System.out.println("relative 2 You are now in: " + rs.getRow()); //0
            rs.relative(-2);
            System.out.println("relative -2 You are now in: " + rs.getRow()); //3

            // Move to the last row in the result set
            rs.absolute(-1);
            System.out.println("absolute -1 You are now in: " + rs.getRow()); //4

            // Move 3 records backward from the current position
            // (second row)
            rs.relative(-3);
            System.out.println("relative -3 You are now in: " + rs.getRow());//1

            rs.relative(-3);
            System.out.println("relative -3 You are now in: " + rs.getRow());//0

            rs.relative(-3);
            System.out.println("relative -3 You are now in: " + rs.getRow());//0

            rs.relative(3);
            System.out.println("relative 3 You are now in: " + rs.getRow());//3

            rs.relative(3);
            System.out.println("relative 3 You are now in: " + rs.getRow());

            rs.relative(3);
            System.out.println("relative 3 You are now in: " + rs.getRow());

            rs.relative(-3);
            System.out.println("-3 You are now in: " + rs.getRow());
            System.out.println(rs.getInt(1));

            //'rs.relative(-3);' doesn't throw any exception but keeps the cursor just
            // before the 1st record. According to javadoc of relative method,
            // "Attempting to move beyond the first/last row in the result set
            // positions the cursor before/after the first/last row". Same is true for
            // absolute method as well.
            //
            //'rs.relative(1);' is identical to 'rs.next()' so it moves the cursor to
            // the 1st record.
            //
            //'rs.getInt(1)' returns 101.
        }
    }
}
