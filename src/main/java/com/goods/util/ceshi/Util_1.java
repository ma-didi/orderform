package com.goods.util.ceshi;

import com.goods.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;


/**
 * hibernate的测试类
 * @author liu
 * @date 2020/2/10 - 12:43
 */
public class Util_1 {
    @Test
    public void test_util1(){
        Configuration cfg = new Configuration();
        SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        //在session基础上开启一个事务
        session.beginTransaction();
        //查询方式
        String hpl="from Users";
        List<Users> query = session.createQuery(hpl).list();
        String to = query.toString();
        System.out.println(to);
       /* Users use =(Users) session.get(Users.class, 2);
        System.out.println(use);*/
        //提交事务
        session.getTransaction().commit();
        //关闭事务
        session.close();
        sessionFactory.close();
    }
}
