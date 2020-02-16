package org.llw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectUtil {
    public static final String SQL_DRIVER="com.mysql.jdbc.Driver";
    public static final String SQL_URL="jdbc:mysql://localhost:3306/";
    public static final String SQL_USERNAME="root";
    public static final String SQL_PASSWORD="root";

    static {
        try{
            Class.forName(SQL_DRIVER);
        }catch (Exception e ) {
            e.printStackTrace();
        }
    }

    public static Connection getConnect() throws Exception {
        Connection connection =  DriverManager.getConnection(SQL_URL, SQL_USERNAME, SQL_PASSWORD);

        return connection;
    }

    public static  void gracefulClose(Connection con, Statement st, ResultSet rs) {

        try {
            if(rs != null){
                rs.close();
            }
            if(st != null){
                st.close();
            }
            if(con != null){
                con.close();
            }
        }catch (Exception e) {

        }
    }
}
