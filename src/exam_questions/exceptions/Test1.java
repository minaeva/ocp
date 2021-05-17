package exam_questions.exceptions;

import java.sql.SQLException;

public class Test1 {
    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e;
        }
        //          it is allowed to use super class reference variable
        //          in throw statement referring to sub class Exception
        //          object.
        //
        //In this case, method m() throws SQLException and compiler knows that
        // variable e (Exception type) refers to an instance of SQLException only
        // and hence allows it.
        //
        //Program executes successfully and prints 'Caught Successfully.' on to the
        // console.
    }

    public static void main(String[] args) {
        try {
            m();
        } catch (SQLException e) {
            System.out.println("Caught Successfully.");
        }
    }
}
