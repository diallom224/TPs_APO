
public class Trinome {
    int a;
    int b;
    int c;
    int delta;

    // Constructeur
    Trinome(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = b * b - 4 * a * c;
    }

    // Retourne le nombre de racines réelles
    int nbRacine() {
        if (a != 0) {
            if (delta == 0) {
                return 1;
            } else if (delta < 0) {
                return 0;
            } else {
                return 2;
            }
        } else {
            // Cas d'une équation de degré 1 : bx + c = 0
            return 1;
        }
    }

    // Racine 1
    double getRacine1() throws Exception {
        int nbr = nbRacine();
        if (nbr == 0) {
            throw new Exception("Pas de racine réelle.");
        } else if (a == 0) {
            // Équation du type bx + c = 0
            return -1.0 * c / b;
        } else if (nbr == 2) {
            return ((-1.0 * b) - Math.sqrt(delta)) / (2.0 * a);
        } else {
            // Racine double
            return -1.0 * b / (2.0 * a);
        }
    }

    // Racine 2
    double getRacine2() throws Exception {
        if (nbRacine() == 2) {
            return ((-1.0 * b) + Math.sqrt(delta)) / (2.0 * a);
        } else {
            throw new Exception("Il n’y a pas de deuxième racine.");
        }
    }

    // Représentation textuelle
    public String toString() {
        String resultat = "";

        // a
        if (a != 0) {
            resultat += a + "x²";
        }

        // b
        if (b > 0) {
            resultat += (a != 0 ? " + " : "") + b + "x";
        } else if (b < 0) {
            resultat += " - " + (-b) + "x";
        }

        // c
        if (c > 0) {
            resultat += " + " + c;
        } else if (c < 0) {
            resultat += " - " + (-c);
        }

        resultat += " = 0";
        return resultat;
    }

    
    
}


