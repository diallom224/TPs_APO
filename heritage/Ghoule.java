public class Ghoule extends Humain {
    boolean kagoune;
    boolean voler;
    String mangeDesHumain;

    // Constructeur par défaut
    public Ghoule() {
        super("NomParDefaut", "PrenomParDefaut", "Je parle", 100, "Inconnu");
        this.kagoune = true;
        this.voler = true;
        this.mangeDesHumain = "Je mange des hamains";
    }

    // Constructeur avec arguments
    public Ghoule(String nom, String prenom, String parle, int age, String sexe,boolean kagoune, boolean voler, String mangeDesHumain) {
        super(nom, prenom, parle, age, sexe);
        this.kagoune = kagoune;
        this.voler = voler;
        this.mangeDesHumain = mangeDesHumain;
    }

    // Ghoule qui mange des humain
    public void manger() {
        System.out.println(mangeDesHumain + " 🩸");
    }

    // getter et setter
    public boolean isKagoune() { return kagoune; }
    public void setKagoune(boolean kagoune) { this.kagoune = kagoune; }

    public boolean jeVole() { return voler; }
    public void setVoler(boolean voler) { this.voler = voler; }

    public String getMangeDesHumain() { return mangeDesHumain; }
    public void setMangeDesHumain(String mangeDesHumain) { this.mangeDesHumain = mangeDesHumain; }
}
