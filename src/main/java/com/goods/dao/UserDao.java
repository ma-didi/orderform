package com.goods.dao;

import com.goods.model.Users;
import com.goods.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author liu
 * @date 2019/12/22 - 15:54
 */
public class UserDao {
    private PreparedStatement pst;
    private ResultSet re;

    public Users selectAnduser(Users us){
        Users num=null;
        String sql="select uid,uname,upaw,status from users where uname=? and upaw=?";
        pst=DBUtil.getgo(sql);
        try {
            pst.setString(1,us.getUname());
            pst.setString(2,us.getUpaw());
            re=pst.executeQuery();
            if(re.next()){
                num= new Users(re.getInt(1),re.getString(2),re.getString(3),re.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(re);
        }
        return num;
    }
}
