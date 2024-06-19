## Matrice de Tests

| **Conditions**                       | **TC1**                       | **TC2**                           | **TC3**                              | **TC4**                              | **TC5**                                    |
|------------------------------------- |------------------------------ |---------------------------------- |------------------------------------- |------------------------------------- |-------------------------------------------- |
| **Ajout de voitures**                |                              |                                  |                                      |                                      |                                            |
| Ajout d'une seule voiture            | V                            | F                                | F                                    | F                                    | F                                          |
| Ajout de plusieurs voitures          | F                            | V                                | F                                    | V                                    | F                                          |
| **Calcul du prix moyen**             |                              |                                  |                                      |                                      |                                            |
| Calcul du prix moyen avec une seule voiture | F                      | F                                | V                                    | F                                    | F                                          |
| Calcul du prix moyen avec plusieurs voitures | F                   | F                                | F                                    | V                                    | F                                          |
| **Gestion des exceptions**           |                              |                                  |                                      |                                      |                                            |
| Calcul du prix moyen avec aucune voiture | F                      | F                                | F                                    | F                                    | V                                          |
| **Entrées**                          |                              |                                  |                                      |                                      |                                            |
| Voitures ajoutées                    | Voiture("Toyota", 30000)     | Voiture("Honda", 25000), Voiture("BMW", 40000) | Voiture("Toyota", 30000)           | Voiture("Toyota", 30000), Voiture("Honda", 25000) | Aucune voiture ajoutée                      |
| **Expected Output**                  |                              |                                  |                                      |                                      |                                            |
| Résultat attendu                     | -                            | -                                | 30000.0                              | (30000.0 + 25000.0) / 2              | ArithmeticException ("Divided by 0")        |


dans le dossier matrice/
