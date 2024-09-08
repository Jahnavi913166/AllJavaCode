package com.training.Serialization_deSerialization;

import java.io.Serializable;

public class Product implements Serializable {
    private int pid;
    private String pname;

    private int unitprice;

    static int counter;

    static {
        counter = 0;
    }

    {
        this.pid = ++counter;
    }

    public Product(String pname, int unitprice) {
        this.pname = pname;
        this.unitprice = unitprice;
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

    public int getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(int unitprice) {
        this.unitprice = unitprice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", unitprice=" + unitprice +
                '}';
    }
}
