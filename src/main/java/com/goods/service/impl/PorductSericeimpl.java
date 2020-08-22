package com.goods.service.impl;

import com.goods.dao.PorductDao;
import com.goods.model.Users;
import com.goods.service.PorductSercice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liu
 * @date 2020/2/9 - 18:44
 */
public class PorductSericeimpl implements PorductSercice {
    //注入PorductDao
    private PorductDao dao;

    public PorductDao getDao() {
        return dao;
    }

    public void setDao(PorductDao dao) {
        this.dao = dao;
    }

    @Override
    public Users findAndid(int uid) {
        return dao.findAndid(uid);
    }

    @Override
    public List<Users> find() {
        return dao.find();
    }
}
