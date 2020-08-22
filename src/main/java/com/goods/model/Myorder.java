package com.goods.model;

/**
 * @author liu
 * @date 2019/12/20 - 18:34
 */
public class Myorder {
    private String oid;
    private int por_id;
    private int orshuliang;
    private String dantime;
    private  Process pro;

    public Myorder(String oid, int por_id, int orshuliang, String dantime, Process pro) {
        this.oid = oid;
        this.por_id = por_id;
        this.orshuliang = orshuliang;
        this.dantime = dantime;
        this.pro = pro;
    }

    public Myorder() {
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getPor_id() {
        return por_id;
    }

    public void setPor_id(int por_id) {
        this.por_id = por_id;
    }

    public int getOrshuliang() {
        return orshuliang;
    }

    public void setOrshuliang(int orshuliang) {
        this.orshuliang = orshuliang;
    }

    public String getDantime() {
        return dantime;
    }

    public void setDantime(String dantime) {
        this.dantime = dantime;
    }

    public Process getPro() {
        return pro;
    }

    public void setPro(Process pro) {
        this.pro = pro;
    }

    @Override
    public String toString() {
        return "Myorder{" +
                "oid='" + oid + '\'' +
                ", por_id=" + por_id +
                ", orshuliang=" + orshuliang +
                ", dantime='" + dantime + '\'' +
                ", pro=" + pro +
                '}';
    }
}
