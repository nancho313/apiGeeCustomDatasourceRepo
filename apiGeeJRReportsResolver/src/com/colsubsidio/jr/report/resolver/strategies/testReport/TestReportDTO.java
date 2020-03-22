package com.colsubsidio.jr.report.resolver.strategies.testReport;

import java.io.Serializable;

public class TestReportDTO implements Serializable {

    private String address;
    private String name;
    private int id;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
