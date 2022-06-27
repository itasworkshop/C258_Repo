package org.example;

import java.sql.*;

public class MyTestJDBC {


    public static void main(String[] args) throws SQLException {
        //CRUD --> create, read, update and delete

        Connection conn=  DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","data123");

        Statement st = conn.createStatement();
        ResultSet result = st.executeQuery("select * from employees");

        while(result.next()){
            System.out.println(result.getString("first_name")+" "+result.getString("salary"));
        }
    }
}
