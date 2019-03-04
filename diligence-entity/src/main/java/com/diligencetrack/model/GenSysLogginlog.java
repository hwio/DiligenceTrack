package com.diligencetrack.model;

import java.util.Date;

public class GenSysLogginlog {
    private Integer id;

    private Date loggtime;

    private Integer userid;

    private Date loghours;

    private Date logmins;

    private String ip;

    private Date offlinetime;

    private Integer count;

    private Date mdate;

    private String modifier;

    private Integer df;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLoggtime() {
        return loggtime;
    }

    public void setLoggtime(Date loggtime) {
        this.loggtime = loggtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getLoghours() {
        return loghours;
    }

    public void setLoghours(Date loghours) {
        this.loghours = loghours;
    }

    public Date getLogmins() {
        return logmins;
    }

    public void setLogmins(Date logmins) {
        this.logmins = logmins;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getOfflinetime() {
        return offlinetime;
    }

    public void setOfflinetime(Date offlinetime) {
        this.offlinetime = offlinetime;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }
}