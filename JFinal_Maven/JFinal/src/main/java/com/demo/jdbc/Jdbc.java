package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://172.16.0.76:5433/rbac";
        String user = "demo";
        String password = "demo";
        // 1
        String sql = "select org_name from blms_org where org_id = ?";
        try (Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, "0");
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            }
        }
    }
}
        // 2
        /*String id = "1";
        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement ps = createPreparedStatement(con, id);) {
             ResultSet rs = ps.executeQuery(); {
                   while (rs.next()) {
                       System.out.println(rs.getString(1));
                   }
               }
           }
    }

    private static PreparedStatement createPreparedStatement(Connection con, String id) throws SQLException {
        String sql = "select org_name from blms_org where org_id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);
        return ps;
    }*/
