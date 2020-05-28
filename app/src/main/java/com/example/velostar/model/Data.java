package com.example.velostar.model;

import com.google.gson.annotations.SerializedName;

public class Data {


    @SerializedName("nom")
    private String name;

    @SerializedName("nombreemplacementsactuels")
    private int socle;

    @SerializedName("nombreemplacementsdisponibles")
    private int socleDispo;

    @SerializedName("nombrevelosdisponibles")
    private int veloDispo;



    private Data(){
    }

    public Data(String name, int socle, int socleDispo, int veloDispo) {
        this.name = name;
        this.socle = socle;
        this.socleDispo = socleDispo;
        this.veloDispo = veloDispo;

    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSocle() {
        return socle;
    }
    public void setSocle(int socle) {
        this.socle = socle;
    }
    public int getSocleDispo() {
        return socleDispo;
    }
    public void setSocleDispo(int socleDispo) {
        this.socleDispo = socleDispo;
    }
    public int getVeloDispo() {
        return veloDispo;
    }
    public void setVeloDispo(int veloDispo) {
        this.veloDispo = veloDispo;
    }



    @Override
    public String toString() {
        return "fields{" +
                "nom:'" + name + '\'' +
                "nombreemplacementsactuels:'" + socle + '\'' +
                "nombreemplacementsdisponibles:'" + socleDispo + '\'' +
                "nombrevelosdisponibles:'" + veloDispo + '\'' +

                '}';
    }
}
