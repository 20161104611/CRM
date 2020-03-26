package com.imnu.crm.pojo;

public class Market {
    private Integer id;

    private String name;

    private String flag;

    private Double yuqshour;

    private Double yucshour;

    private Double shjshour;

    private String path;

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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Double getYuqshour() {
        return yuqshour;
    }

    public void setYuqshour(Double yuqshour) {
        this.yuqshour = yuqshour;
    }

    public Double getYucshour() {
        return yucshour;
    }

    public void setYucshour(Double yucshour) {
        this.yucshour = yucshour;
    }

    public Double getShjshour() {
        return shjshour;
    }

    public void setShjshour(Double shjshour) {
        this.shjshour = shjshour;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}