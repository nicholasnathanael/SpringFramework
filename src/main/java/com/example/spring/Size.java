package com.example.spring;

public class Size {
    public Integer height;
    public Integer width;
    public String uom;

    public Size(Integer height, Integer width, String uom) {
        this.height = height;
        this.width = width;
        this.uom = uom;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}