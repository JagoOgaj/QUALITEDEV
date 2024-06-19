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
        if (voitures.size() == 0) {
            throw new ArithmeticException("Divided by 0");
        }

        float prixTotal = 0;
        int nombreVoitures = voitures.size();

        for (int i = 0; i < nombreVoitures; i++) {
            float prix = voitures.get(i).getPrix();
            int nombreLotsDeCinq = (i + 1) / 5; // Nombre de lots de 5 voitures
            float remise = Math.min(nombreLotsDeCinq * 0.05f * prix, 20000); // Calcul de la remise avec une remise maximale de 20 000 euros
            prixTotal += (prix - remise);
        }

        return prixTotal / nombreVoitures;
    }

    public ArrayList<Voiture> getVoitures(){
        return voitures;
    }
}
