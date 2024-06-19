import org.example.StatistiqueIMPL;
import org.example.Voiture;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {
    private StatistiqueIMPL statistique = new StatistiqueIMPL();

    @Test
    void testAjouter() {
        Voiture voiture = new Voiture("Porche", 10000);
        statistique.ajouter(voiture);
        ArrayList<Voiture> voitures = statistique.getVoitures();
        assertEquals(1, voitures.size());
        assertEquals(voiture, voitures.get(0));
    }

    @Test
    void testPrixMoyen_AucuneVoiture() {
        assertThrows(ArithmeticException.class, () -> {
            statistique.prixMoyen();
        });
    }

    @Test
    void testPrixMoyen_UneSeuleVoiture() {
        Voiture voiture = new Voiture("Lamborghini",20000);
        statistique.ajouter(voiture);
        float prixMoyen = statistique.prixMoyen();
        assertEquals(20000, prixMoyen);
    }

    @Test
    void testPrixMoyen_PlusieursVoitures_SansRemise() {
        statistique.ajouter(new Voiture("Audi", 10000));
        statistique.ajouter(new Voiture("Mercedes", 15000));
        statistique.ajouter(new Voiture("Porche", 20000));
        float prixMoyen = statistique.prixMoyen();
        assertEquals(15000, prixMoyen);
    }

    @Test
    void testPrixMoyen_AvecRemise() {
        statistique.ajouter(new Voiture("Tesla", 10000));
        statistique.ajouter(new Voiture("Audi", 15000));
        statistique.ajouter(new Voiture("Porche", 20000));
        statistique.ajouter(new Voiture("Mercedes", 25000));
        statistique.ajouter(new Voiture("Mclaren", 30000));
        float prixMoyen = statistique.prixMoyen();
        assertTrue(prixMoyen < 20000); // Vérifier que la remise a été appliquée
    }
}
