package org.example;

public interface Statistique {
    public void ajouter(Voiture voiture);

    public float prixMoyen() throws ArithmeticException;
}