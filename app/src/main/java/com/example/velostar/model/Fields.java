package com.example.velostar.model;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.Date;

public class Fields {



    @SerializedName("nom")
    private String name;

    @SerializedName("nombreemplacementsactuels")
    private int socle;

    @SerializedName("nombreemplacementsdisponibles")
    private int socleDispo;

    @SerializedName("nombrevelosdisponibles")
    private int veloDispo;

    @SerializedName("etat")
    private String etat;

    @SerializedName("lastupdate")
    private Date lastupdate;

    @SerializedName("idstation")
    private String idstation;

    @SerializedName("coordonnees")
    private double[] coordonnes;

    public Fields(String name, int socle, int socleDispo, int veloDispo, String etat, Date lastupdate, String idstation, double[] coordonnes) {
        this.name = name;
        this.socle = socle;
        this.socleDispo = socleDispo;
        this.veloDispo = veloDispo;
        this.etat = etat;
        this.lastupdate = lastupdate;
        this.idstation = idstation;
        this.coordonnes = coordonnes;
    }

    public Fields() {
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

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getIdstation() {
        return idstation;
    }

    public void setIdstation(String idstation) {
        this.idstation = idstation;
    }

    public double[] getCoordonnes() {
        return coordonnes;
    }

    public void setCoordonnes(double[] coordonnes) {
        this.coordonnes = coordonnes;
    }

    @Override
    public String toString() {
        return "Fields{" +
                "name='" + name + '\'' +
                ", socle=" + socle +
                ", socleDispo=" + socleDispo +
                ", veloDispo=" + veloDispo +
                ", etat='" + etat + '\'' +
                ", lastupdate=" + lastupdate +
                ", idstation='" + idstation + '\'' +
                ", coordonnes=" + Arrays.toString(coordonnes) +
                '}';
    }
}
