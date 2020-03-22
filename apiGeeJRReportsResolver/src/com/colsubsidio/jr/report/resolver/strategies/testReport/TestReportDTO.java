package com.colsubsidio.jr.report.resolver.strategies.testReport;

import com.colsubsidio.jr.commons.dto.IApiGeeDTO;

import java.io.Serializable;
import java.util.List;

public class TestReportDTO implements IApiGeeDTO {

    List<ReportDTO> data;

    public List<ReportDTO> getData() {
        return data;
    }

    public void setData(List<ReportDTO> data) {
        this.data = data;
    }

    public class ReportDTO implements Serializable {

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
}
