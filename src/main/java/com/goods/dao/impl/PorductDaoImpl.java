package com.goods.dao.impl;


import com.goods.dao.PorductDao;
import com.goods.model.Users;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * @author liu
 * @date 2020/2/9 - 18:35
 */
public class PorductDaoImpl implements PorductDao {
    private SessionFactory factory;

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Users findAndid(int uid) {
        return null;
    }

    @Override
    public List<Users> find() {
        Session session = factory.openSession();
        //开启一个事务
        Transaction tx = session.beginTransaction();
        String hpl="from Users";
        List<Users> li = session.createQuery(hpl).list();
        //提交事务，（关闭事务）
        tx.commit();
        session.close();
        return li;
    }
}
