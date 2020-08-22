package com.goods.dao;

import com.goods.model.Users;

import java.util.List;

/**
 * @author liu
 * @date 2019/12/20 - 18:50
 */
public interface PorductDao {
    Users findAndid(int uid);
    List<Users> find();
}
