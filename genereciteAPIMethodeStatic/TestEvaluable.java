public class TestEvaluable {
    public static void main(String[] args) {
        Etudiant[] notesPOO = new Etudiant[5];
        notesPOO[0] = new Etudiant("Pat Bole", 4.5);
        notesPOO[1] = new Etudiant("Agathe Deblouse", 13.2);
        notesPOO[2] = new Etudiant("Maggy Bole", 19.5);
        notesPOO[3] = new Etudiant("Pat Track", 15.45);
        notesPOO[4] = new Etudiant("Alex Kuzbidon", 2.5);

        Statistiques<Etudiant> stats = new Statistiques<>(notesPOO);
        stats.afficherValeurs();
        System.out.println("min : " + stats.min().valeur());
        System.out.println("max : " + stats.max().valeur()  );
        System.out.println("moyenne : " + stats.moyenne());
        System.out.println("variance : " + stats.variance());
    }
}
