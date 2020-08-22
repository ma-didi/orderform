package com.goods.service;

import com.goods.model.Users;

import java.util.List;

/**
 * @author liu
 * @date 2020/2/9 - 18:41
 */
public interface PorductSercice {
    Users findAndid(int uid);
    List<Users> find();
}
