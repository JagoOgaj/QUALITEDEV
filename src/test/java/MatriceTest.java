import org.example.StatistiqueIMPL;
import org.example.Voiture;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MatriceTest {
    private StatistiqueIMPL statistique = new StatistiqueIMPL();
    @Test
    public void testAjoutVoitureUnique() {
        Voiture voiture = new Voiture("Toyota", 30000);
        statistique.ajouter(voiture);

        ArrayList<Voiture> voitures = statistique.getVoitures();
        assertEquals(1, voitures.size());
        assertEquals(voiture, voitures.get(0));
    }

    @Test
    public void testAjoutPlusieursVoitures() {
        Voiture voiture1 = new Voiture("Honda", 25000);
        Voiture voiture2 = new Voiture("BMW", 40000);
        statistique.ajouter(voiture1);
        statistique.ajouter(voiture2);

        ArrayList<Voiture> voitures = statistique.getVoitures();
        assertEquals(2, voitures.size());
        assertTrue(voitures.contains(voiture1));
        assertTrue(voitures.contains(voiture2));
    }

    @Test
    public void testCalculPrixMoyenAvecUneVoiture() {
        Voiture voiture = new Voiture("Toyota", 30000);
        statistique.ajouter(voiture);

        float prixMoyen = statistique.prixMoyen();
        assertEquals(30000.0f, prixMoyen);
    }

    @Test
    public void testCalculPrixMoyenAvecPlusieursVoitures() {
        Voiture voiture1 = new Voiture("Toyota", 30000);
        Voiture voiture2 = new Voiture("Honda", 25000);
        statistique.ajouter(voiture1);
        statistique.ajouter(voiture2);

        float prixMoyen = statistique.prixMoyen();
        assertEquals((30000.0f + 25000.0f) / 2, prixMoyen);
    }

    @Test
    public void testCalculPrixMoyenAucuneVoiture() {
        assertThrows(ArithmeticException.class, () -> statistique.prixMoyen());
    }
}
