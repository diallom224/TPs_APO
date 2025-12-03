public class TestTrinome {
    public static void main(String[] args) {
        try {
            // Exemple 1 : équation 5x² + 3x - 8 = 0
            Trinome trinome = new Trinome(5, 3, -8);
            System.out.println("On considère le trinôme : " + trinome.toString());
            System.out.println("Ce trinôme a " + trinome.nbRacine() + " racine(s).");

            if (trinome.nbRacine() >= 1) {
                System.out.println("- Racine 1 : " + trinome.getRacine1());
            }
            if (trinome.nbRacine() == 2) {
                System.out.println("- Racine 2 : " + trinome.getRacine2());
            }

            System.out.println(); // saut de ligne

            // Exemple 2 : équation du premier degré 3x - 8 = 0
            Trinome trinome2 = new Trinome(0, 3, -8);
            System.out.println("On considère le trinôme : " + trinome2);
            System.out.println("Ce trinôme a " + trinome2.nbRacine() + " racine(s).");
            System.out.println("- Racine 1 : " + trinome2.getRacine1());
            if (trinome2.nbRacine() == 2) {
                System.out.println("- Racine 2 : " + trinome2.getRacine2());
            }

        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}