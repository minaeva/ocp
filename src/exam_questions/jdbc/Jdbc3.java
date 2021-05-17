package exam_questions.jdbc;

import java.sql.*;


public class Jdbc3 {
    public static void main(String[] args) throws SQLException {
        String query = "Select msg1 as msg, msg2 as msg FROM MESSAGES";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306" +
                        "/my_db?allowPublicKeyRetrieval=true&useSSL=false", "sveta", "sveta");
             Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query);) {
            rs.absolute(1);
            System.out.println(rs.getString("msg"));
            System.out.println(rs.getString("msg"));
            //Happy New Year!
            //Happy New Year!
        }

        //In the given query, both the column aliases have same name 'msg'. 'rs
        // .getString("msg")' always returns the first matching column.
        //
        //In case of matching column names, column indexes can be used.
        //
        //rs.getString(1) would return 'Happy New Year!' and rs.getString(2) would
        // return 'Happy Holidays!'.
    }
}

/*        MESSAGES table contains below records:
        'Happy New Year!', 'Happy Holidays!'
*/
