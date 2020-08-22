package com.goods.model;

/**
 * @author liu
 * @date 2019/12/19 - 16:43
 */
public class Users {
    private int uid;
    private String uname;
    private String upaw;
    private int status;

    public Users(int uid, String uname, String upaw, int status) {
        this.uid = uid;
        this.uname = uname;
        this.upaw = upaw;
        this.status = status;
    }

    public Users() {
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpaw() {
        return upaw;
    }

    public void setUpaw(String upaw) {
        this.upaw = upaw;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upaw='" + upaw + '\'' +
                ", status=" + status +
                '}';
    }
}
