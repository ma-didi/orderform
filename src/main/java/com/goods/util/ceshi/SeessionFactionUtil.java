package com.goods.util.ceshi;


import com.goods.model.Users;
import com.goods.service.PorductSercice;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liu
 * @date 2020/2/10 - 13:39
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
@Transactional
public class SeessionFactionUtil {
    @Autowired
    private PorductSercice porductService;

    @org.junit.Test
    public void findAnd(){
        List<Users> users = porductService.find();
        System.out.println(users.toString());
    }
}
