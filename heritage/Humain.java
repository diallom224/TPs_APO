public class Humain {
    private String nom;
    private String prenom;
    private String parle;
    private String sexe;
    private int age;



    // Constructeur
    public Humain(String nom, String prenom, String parle, int age, String sexe) {    
        this.nom = nom;
        this.prenom = prenom;
        this.parle = parle;
        this.sexe = sexe;
        this.age = age;
    }

    // Méthodes
    public void parler() {
        System.out.println("Bonjour tout le monde :)");
    }

    public void courrir() {
        System.out.println("🏃💨");
    }

    // Getters
    public String getNom() { return this.nom; }
    public String getPrenom() { return this.prenom; }
    public String getSexe() { return this.sexe; }
    public int getAge() { return this.age; }
    public String getParle() {return this.parle;}

    // Setters
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setAge(int age) { this.age = age; }
    public void setSexe(String sexe) { this.sexe = sexe; }
    public void setParle(String parle) { this.parle = parle; }
}
