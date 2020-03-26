package com.imnu.crm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ERecord {
    private Integer id;

    private Integer eId;

    private String name;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date date;

    private String neirong;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
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

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

	@Override
	public String toString() {
		return "ERecord [id=" + id + ", eId=" + eId + ", name=" + name + ", date=" + date + ", neirong=" + neirong
				+ "]";
	}
    
}