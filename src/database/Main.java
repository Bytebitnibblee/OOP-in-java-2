package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/oop";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Database connected successfully");
            }
            
            // 3.create the statement object
            Statement st=con.createStatement();
            
//            //4. execute the query
//			/*
//			 * String query="insert into student values(3,'suyog',22)";
//			 * 
//			 * int nor=st.executeUpdate(query);
//			 * 
//			 * if(nor>0) { System.out.println("1 row inserted successfully"); }
//			 */
//            
           String query="select * from student";
            ResultSet rs= st.executeQuery(query);
        	System.out.println("ROLL| Name | Age");

            
            while(rs.next()) {
               int roll=rs.getInt(1);
            		   String name=rs.getString(2);
            		   int age=rs.getInt(3);
            	System.out.println(roll+"|"+name+"|"+age);
            	
            }
            
            //5.close the connection
/*            con.close();
            */
            
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
