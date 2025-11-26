public class Personne {
    private String nom;
    private int age;

    public Personne(String n, int a) { nom = n; age = a; }

    public String getNom() { return nom; }
    public int getAge() { return age; }

    @Override
    public String toString() { return nom + " " + age; }
}
