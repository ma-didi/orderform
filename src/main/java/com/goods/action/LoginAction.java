package com.goods.action;

import com.goods.dao.UserDao;
import com.goods.model.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * @author liu
 * @date 2019/12/22 - 16:16
 */
public class LoginAction extends ActionSupport {

    static UserDao dao=new UserDao();
    private Users use;

    public Users getUse() {
        return use;
    }

    public void setUse(Users use) {
        this.use = use;
    }


    @Override
    public String execute() throws Exception {
        return null;
    }

    public String selectAndUser() throws  Exception {
        Users mo=new Users(0,use.getUname(),use.getUpaw(),0);
        Users use=dao.selectAnduser(mo);
        Map request= (Map) ActionContext.getContext().get("request");
        if (use!=null){
            if(use.getStatus()!=0){
                request.put("uname",use.getUname());
                return  "selectAndUser";
            }else{
                request.put("metter","这个账号不存在");
                return "index";
            }
        }else{
            request.put("metter","账号名或密码错误");
            return  "index";
        }
    }
}
