public class Etudiant implements Evaluable {
    private String nom;
    private double note;

    public Etudiant(String nom, double note) {
        this.nom = nom;
        this.note = note;
    }

    @Override
    public double valeur() {
        return note;
    }

    @Override
    public String toString() {
        return nom;
    }
}

