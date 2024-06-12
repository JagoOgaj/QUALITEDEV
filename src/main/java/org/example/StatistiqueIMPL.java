package org.example;

import java.util.ArrayList;

public class StatistiqueIMPL implements Statistique{
    private ArrayList<Voiture> voitures;


    public StatistiqueIMPL(){
        voitures = new ArrayList<Voiture>();
    }


    @Override
    public void ajouter(Voiture voiture) {
        voitures.add(voiture);
    }

    @Override
    public float prixMoyen() throws ArithmeticException {
        float prixMoyen = 0;
        for(Voiture voiture : this.voitures){
            prixMoyen+= voiture.getPrix();
        }
        if(voitures.size() == 0){
            throw  new ArithmeticException("Divided by 0");
        }
        return prixMoyen/voitures.size();
    }

    public ArrayList<Voiture> getVoitures(){
        return voitures;
    }
}
