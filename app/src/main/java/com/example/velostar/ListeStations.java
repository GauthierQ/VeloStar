package com.example.velostar;

import java.util.ArrayList;

public class ListeStations {

        /**  Membres Privés */
        private ArrayList<Station> lesStations;	// pour contenir une liste de stations
        private double _positionLatitude;	// latitude de la position de l'utilisateur (0 si inconnue)
        private double _positionLongitude;	// longitude de la position de l'utilisateur (0 si inconnue)

        /** Constructeurs */
        public ListeStations()
        {  // création de la liste
            this.lesStations = new ArrayList<Station>();
            _positionLatitude = 0;
            _positionLongitude = 0;
        }
        public ListeStations(double unePositionLatitude, double unePositionLongitude)
        {  // création de la liste
            this.lesStations = new ArrayList<Station>();
            _positionLatitude = unePositionLatitude;
            _positionLongitude = unePositionLongitude;
        }

        /** Accesseurs */
        public double getPositionLatitude() {
            return _positionLatitude;
        }
        public void setPositionLatitude(double uneLatitude) {
            _positionLatitude = uneLatitude;
        }
        public double getPositionLongitude() {
            return _positionLongitude;
        }
        public void setPositionLongitude(double uneLongitude) {
            _positionLongitude = uneLongitude;
        }

        /** Méthodes d'instance publiques */
        public void ajouteStation(Station uneStation)
        {  // ajoute l'objet à la liste
            this.lesStations.add(uneStation);
        }


    }
