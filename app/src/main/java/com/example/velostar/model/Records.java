package com.example.velostar.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Records {

    @SerializedName("fields")
    private Fields fields;

    public Records(Fields fields) {
        this.fields = fields;
    }

    public Records() {
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return "Records{" +
                "fields=" + fields +
                '}';
    }
}
