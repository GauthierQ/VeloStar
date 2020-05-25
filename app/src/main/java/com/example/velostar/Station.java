package com.example.velostar;

import java.time.Instant;
import java.util.Date;

public class Station {

    private String id;
    private String nom;
    private boolean etat;
    private double latitude;
    private double longitude;
    private int emplacementDispo;
    private int emplacementActuel;
    private int velosDispo;
    private Date lastUpdate;


    //CONSTRUCTEURS
    //Contructeur par defaut

    public Station() {
        this.id = "";
        this.nom = "";
        this.etat = false;
        this.latitude = 0;
        this.longitude = 0;
        this.emplacementDispo = -1;
        this.emplacementActuel = -1;
        this.velosDispo = -1;
        this.lastUpdate = null;
    }

    public Station(String id, String nom, boolean etat, double latitude, double longitude, int emplacementDispo, int emplacementActuel, int velosDispo, Date lastUpdate) {
        this.id = id.trim();
        this.nom = nom.trim();
        this.etat = etat;
        this.latitude = latitude;
        this.longitude = longitude;
        this.emplacementDispo = emplacementDispo;
        this.emplacementActuel = emplacementActuel;
        this.velosDispo = velosDispo;
        this.lastUpdate = lastUpdate;
    }

    //Getters
    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public boolean isEtat() {
        return etat;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }

    public int getEmplacementDispo() {
        return emplacementDispo;
    }

    public int getEmplacementActuel() {
        return emplacementActuel;
    }

    public int getVelosDispo() {
        return velosDispo;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void valoriser(String id, String nom, String adresse, double latitude, double longitude, boolean paiementCarte){
        this.id=id.trim();
        this.nom=nom.trim();
        this.latitude=latitude;
        this.longitude=longitude;
    }

    public void valoriser(boolean etat, Date lastUpdate, int emplacementDispo, int emplacementActuel, int velosDispo){
        this.etat=etat;
        this.lastUpdate = lastUpdate;
        this.emplacementDispo=emplacementDispo;
        this.emplacementActuel=emplacementActuel;
        this.velosDispo=velosDispo;
    }

    @Override
    public String toString() {

        if (this.getEmplacementDispo() != -1 && this.getVelosDispo() != -1){
            return  "Numéro :\t\t" + this.getId()+ '\n' +
                    "Nom :\t\t" + this.getNom() + '\n' +
                    "Latitude :\t\t" + this.getLatitude() + '\n' +
                    "Longitude :\t" + this.getLongitude() +'\n' +
                    "\nEtat :\t" + this.isEtat() + '\n' +
                    "Emplacement Disponible :\t\t" + this.getEmplacementDispo() + '\n' +
                    "Emplacement Actuel :\t\t" + this.getEmplacementActuel() + '\n' +
                    "Velos Disponible :\t\t" + this.getVelosDispo() + '\n' +
                    "Dernière mis à jour :\t\t" + this.getLastUpdate() + '\n'
                    ;
        } else {

            return "Numéro :\t\t" + this.getId()+ '\n' +
                    "Nom :\t\t" + this.getNom() + '\n' +
                    "Latitude :\t\t" + this.getLatitude() + '\n' +
                    "Longitude :\t" + this.getLongitude() +'\n';

        }
    }
}
