package com.example.velostar;

public class Station {

    private String id;
    private String nom;
    private String adresse;
    private boolean etat;
    private double latitude;
    private double longitude;
    private int soclesDisop;
    private int velosDispo;
    private boolean paiementCarte;

    //CONSTRUCTEURS
    //Contructeur par defaut
    public Station() {
        this.id = "";
        this.nom = "";
        this.adresse = "";
        this.etat = false;
        this.latitude = 0;
        this.longitude = 0;
        this.soclesDisop = -1;
        this.velosDispo = -1;
        this.paiementCarte = false;
    }
    public Station(String id, String nom, String adresse, boolean etat, double latitude, double longitude, int soclesDisop, int velosDispo, boolean paiementCarte) {
        this.id = id.trim();
        this.nom = nom.trim();
        this.adresse = adresse.trim();
        this.etat = etat;
        this.latitude = latitude;
        this.longitude = longitude;
        this.soclesDisop = soclesDisop;
        this.velosDispo = velosDispo;
        this.paiementCarte = paiementCarte;
    }


    //Getters
    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
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
    public int getSoclesDisop() {
        return soclesDisop;
    }
    public int getVelosDispo() {
        return velosDispo;
    }
    public boolean isPaiementCarte() {
        return paiementCarte;
    }


    public void valoriser(String id, String nom, String adresse, double latitude, double longitude, boolean paiementCarte){
        this.id=id.trim();
        this.nom=nom.trim();
        this.adresse=adresse.trim();
        this.latitude=latitude;
        this.longitude=longitude;
        this.paiementCarte=paiementCarte;
    }

    public void valoriser(boolean etat, int soclesDisop, int velosDispo){
        this.etat=etat;
        this.soclesDisop=soclesDisop;
        this.velosDispo=velosDispo;
    }

    @Override
    public String toString() {

        if (this.getSoclesDisop() != -1 && this.getVelosDispo() != -1){
            return  "Numéro :\t\t" + this.getId()+ '\n' +
                    "Nom :\t\t" + this.getNom() + '\n' +
                    "Adresse :\t\t" + this.getAdresse() + '\n' +
                    "Latitude :\t\t" + this.getLatitude() + '\n' +
                    "Longitude :\t" + this.getLongitude() +'\n' +
                    "PaiementCarte :\t" + this.isPaiementCarte() + '\n' +
                    "\nEtat :\t" + this.isEtat() + '\n' +
                    "SoclesDisop :\t\t" + this.getSoclesDisop() + '\n' +
                    "VelosDispo :\t\t" + this.getVelosDispo() + '\n' ;
        } else {

            return "Numéro :\t\t" + this.getId()+ '\n' +
                    "Nom :\t\t" + this.getNom() + '\n' +
                    "Adresse :\t\t" + this.getAdresse() + '\n' +
                    "Latitude :\t\t" + this.getLatitude() + '\n' +
                    "Longitude :\t" + this.getLongitude() +'\n' +
                    "PaiementCarte :\t" + this.isPaiementCarte() + '\n';
        }
    }
}
