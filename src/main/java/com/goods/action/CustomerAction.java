package com.goods.action;

import com.goods.model.Users;
import com.goods.service.PorductSercice;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author liu
 * @date 2020/2/9 - 19:58
 */
public class CustomerAction extends ActionSupport {
    @Autowired
    private PorductSercice porductSercice;

    public String findAndUid() throws Exception{
        List<Users> users = porductSercice.find();
        Map request= (Map) ActionContext.getContext().get("request");
        request.put("li",users);
        return "selectAndUser";
    }
}
