package com.lms.asserts.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection1 {
    private static DbConnection1 dbConnection = null;
    private Connection connection;

    private DbConnection1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2 step
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_desktop_db",
                "root", "fight2kill");
    }

    public static DbConnection1 getInstance() throws SQLException, ClassNotFoundException {
        if (dbConnection == null) {
            dbConnection = new DbConnection1();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
// getInstance().getConnection();
