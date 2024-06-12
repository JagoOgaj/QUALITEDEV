package org.example;

public class Voiture {
    private String marque;
    private int prix;

    public Voiture(){}

    public Voiture(String marque, int prix){
        this.marque = marque;
        this.prix = prix;
    }

    public int getPrix(){
        return prix;
    }

    public String getMarque(){
        return marque;
    }
    //test
}
