package com.example.velostar.model;

import com.google.gson.annotations.SerializedName;

public class Data {


    @SerializedName("nom")
    private String name;

    @SerializedName("nombreemplacementsactuels")
    private String socle;

    @SerializedName("nombreemplacementsdisponibles")
    private String socleDispo;

    @SerializedName("nombrevelosdisponibles")
    private String veloDispo;




    private Data(){
    }

    public Data(String name, String socle, String socleDispo, String veloDispo) {
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
    public String getSocle() {
        return socle;
    }
    public void setSocle(String socle) {
        this.socle = socle;
    }
    public String getSocleDispo() {
        return socleDispo;
    }
    public void setSocleDispo(String socleDispo) {
        this.socleDispo = socleDispo;
    }
    public String getVeloDispo() {
        return veloDispo;
    }
    public void setVeloDispo(String veloDispo) {
        this.veloDispo = veloDispo;
    }



    @Override
    public String toString() {
        return "Card{" +
                ", name='" + name + '\'' +
                ", socle='" + socle + '\'' +
                ", socleDispo='" + socleDispo + '\'' +
                ", veloDispo='" + veloDispo + '\'' +

                '}';
    }
}
