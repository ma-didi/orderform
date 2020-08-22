package com.goods.model;

/**
 * @author liu
 * @date 2019/12/20 - 18:27
 */
public class Porduct {
    private int pid;
    private String pname;
    private String pclass;
    private int stock;
    private float rise;

    public Porduct(int pid, String pname, String pclass, int stock, float rise) {
        this.pid = pid;
        this.pname = pname;
        this.pclass = pclass;
        this.stock = stock;
        this.rise = rise;
    }

    public Porduct() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getRise() {
        return rise;
    }

    public void setRise(float rise) {
        this.rise = rise;
    }

    @Override
    public String toString() {
        return "Porduct{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pclass='" + pclass + '\'' +
                ", stock=" + stock +
                ", rise=" + rise +
                '}';
    }
}
