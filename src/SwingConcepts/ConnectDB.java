package SwingConcepts;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

     static Connection  getConnection(){
        try{
            //DB Mysql JDBC DRIVER Load
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establish DB connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myJava", "root", "Shamsher@mysql");
            System.out.println("DB connected successfully");
            return connection;

        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }

}
