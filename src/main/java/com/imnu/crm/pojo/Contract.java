package com.imnu.crm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Contract {
    private Integer id;

    private String name;

    private String uName;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date lDate;

    private String cPath;

    private Double cMoney;

    private String cName;

    private String cLocation;

    private String cHtyouxqi;

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

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getlDate() {
        return lDate;
    }

    public void setlDate(Date lDate) {
        this.lDate = lDate;
    }

    public String getcPath() {
        return cPath;
    }

    public void setcPath(String cPath) {
        this.cPath = cPath;
    }

    public Double getcMoney() {
        return cMoney;
    }

    public void setcMoney(Double cMoney) {
        this.cMoney = cMoney;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcLocation() {
        return cLocation;
    }

    public void setcLocation(String cLocation) {
        this.cLocation = cLocation;
    }

    public String getcHtyouxqi() {
        return cHtyouxqi;
    }

    public void setcHtyouxqi(String cHtyouxqi) {
        this.cHtyouxqi = cHtyouxqi;
    }

	@Override
	public String toString() {
		return "Contract [id=" + id + ", name=" + name + ", uName=" + uName + ", date=" + date + ", lDate=" + lDate
				+ ", cPath=" + cPath + ", cMoney=" + cMoney + ", cName=" + cName + ", cLocation=" + cLocation
				+ ", cHtyouxqi=" + cHtyouxqi + "]";
	}
    
}