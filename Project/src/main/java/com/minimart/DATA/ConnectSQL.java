package com.minimart.DATA;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ConnectSQL {

    static int countConection = 0;
    static int countQuery = 0;
    static int countUpdate = 0;

    Connection conn = null;
    Statement stmt = null;
    ResultSet rset = null;

    String DB_Name = null;
    String user_Name = null;
    String pass = null;

    String ipAddress = null;

    public ConnectSQL() {
        checkDriver();
        ReadFile();
        setupConnect();
    }

    public ConnectSQL(String DB_Name) {
        checkDriver();
        this.DB_Name = DB_Name;
    }

    public ConnectSQL(String DB_Name, String user_Name, String pass) {
        checkDriver();
        this.DB_Name = DB_Name;
        this.user_Name = user_Name;
        this.pass = pass;
        setupConnect();
    }

    // Kết nối tới DB
    private void setupConnect() {
        try {
            String url = "jdbc:mysql://" + ipAddress + "/" + DB_Name + "?useUnicode=true&characterEncoding=UTF-8";
            conn = DriverManager.getConnection(url, user_Name, pass);
            stmt = conn.createStatement();
            countConection++;
            System.out.println("**\n" + countConection + ": Success! Đã kết nối tới '" + DB_Name + "'");

        } catch (SQLException e) {
            System.err.println("-- ERROR! Không thể kết nối tới '" + DB_Name + "'");
            JOptionPane.showMessageDialog(null, "-- ERROR! Không thể kết nối tới '" + DB_Name + "'");
        }
    }

    // đăng nhập
    public void logIn(String user_Name, String pass) {
        this.user_Name = user_Name;
        this.pass = pass;
        setupConnect();
    }

    // lấy data theo câu query
    public ResultSet sqlQuery(String qry) {
        if (checkConnect()) {
            try {
                rset = stmt.executeQuery(qry);
                countQuery++;
                System.out.println(countQuery + ": Success Query! " + qry);
                return rset;

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "-- ERROR! Không thể lấy dữ liệu từ " + DB_Name + "\n" + ex.getLocalizedMessage());
                return null;
            }
        }
        return null;
    }

    // ghi data theo câu update
    public boolean sqlUpdate(String qry) {
        if (checkConnect()) {
            try {
                stmt.executeUpdate(qry);
                countUpdate++;
                System.out.println(countUpdate + ": Success Update! " + qry);
                return true;

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "-- ERROR! Không thể ghi dữ liệu xuống " + DB_Name + "\n" + ex.getLocalizedMessage());
                return false;
            }
        }
        return false;
    }

    // đóng connection
    public void closeConnect() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            System.out.println("Success! Đóng kết nối tới '" + DB_Name + "' thành công.\n**");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Không thể đóng kết nối tới " + DB_Name + "\n" + ex.getLocalizedMessage());
        }
    }

    // check logIn, connect
    public Boolean checkConnect() {
        if (conn == null || stmt == null) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Chưa thiết lập kết nối tới '" + DB_Name + "'. Vui lòng đăng nhập để thiết lập kết nối!");
            return false;
        }
        return true;
    }

    // check driver
    private void checkDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "-- ERROR! Không tìm thấy Driver mySql");
        }
    }

    // lấy headers của table tên tableName trong db này - đã có cách khác, không dùng hàm này nữa
    public ArrayList<String> getHeaders(String tableName) {
        ArrayList<String> headers = new ArrayList<>();
        if (checkConnect()) {
            try {
                ResultSetMetaData rsMetaData = sqlQuery("SELECT * FROM " + tableName).getMetaData();
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                    headers.add(rsMetaData.getColumnName(i));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "-- ERROR! Không thể lấy headers của " + tableName + " trong " + DB_Name);
            }
        }
        return headers;
    }
    public void ReadFile()  {
        File myObj = new File("D:\\minimart_java\\Project\\src\\main\\java\\com\\minimart\\SQL.txt");
        if (myObj.exists()) {
            try {
                Scanner sc = new Scanner(myObj);
                int i = 0;
                String[] sql;
                sql = new String[4];
                for (int j = 0 ; j < 4 ; j++){
                        sql[j] ="";
                }
                while (sc.hasNextLine()) {
                    sql[i] = sc.nextLine();
                    i++;
                }
                ipAddress = sql[0];
                DB_Name = sql[1];
                user_Name = sql[2];
                pass = sql[3];
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "-- ERROR! The file does not exist. '" );
        }
    }
}
