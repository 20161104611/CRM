package com.imnu.crm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Programme {
    private Integer id;

    private String name;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;

    private String ename;

    private String location;

    private String tlocation;

    private String etel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTlocation() {
        return tlocation;
    }

    public void setTlocation(String tlocation) {
        this.tlocation = tlocation;
    }

    public String getEtel() {
        return etel;
    }

    public void setEtel(String etel) {
        this.etel = etel;
    }
}