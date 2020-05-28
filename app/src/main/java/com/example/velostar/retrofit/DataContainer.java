package com.example.velostar.retrofit;

import com.example.velostar.model.Data;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataContainer {

    @SerializedName("records")
    private List<Data> data;

    public DataContainer(){
    }

    public DataContainer(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataContainer{" +
                    "records: [" +
                        "{" +
                            "fields: {" +
                                "etat:" + data +
                                "lastupdate:" + data +
                                "nombrevelosdisponibles:" + data +
                                "nombreemplacementsactuels:" + data +
                                "nom:" + data +
                                "nombreemplacementsdisponibles:" + data +
                                "idstation:" + data +
                                "coordonnees: [" +
                                    data +
                                    data +
                                "]" +
                            "}" +
                        "}" +
                    "]" +
                '}';


    }
}
