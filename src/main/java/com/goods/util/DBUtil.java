package com.goods.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author liu
 * @date 2019/12/19 - 16:42
 */
public class DBUtil {
    private static Connection conn;
    private static PreparedStatement pst;

    public static PreparedStatement getgo(String sql){
        try {
            conn=C3P0Util.getConnection();
            pst=conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pst;
    }
    public static void close(ResultSet re){
        C3P0Util.close(re,pst,conn);
    }
}
