package com.example.velostar.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataContainer {

    @SerializedName("records")
    private List<Records> records;

    public DataContainer(){
    }

    public DataContainer(List<Records> data) {
        this.records = data;
    }

    public List<Records> getRecords() {
        return records;
    }

    public void setRecords(List<Records> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                    "records: [" +

                records +
                    "]" +
                "}";
    }
}
