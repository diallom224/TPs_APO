public class App {
    public static void main(String[] args) {
        // Création d'un Hamain
        Humain humain = new Humain("Diallo", "Mamadou", "Je suis un Hamain", 24, "M");
        humain.parler();
        humain.setParle("Je suis un humain soyez rassurer :");
        System.out.println(humain.getParle());
    

        System.out.println();

        // Création d'une Ghoule
        Ghoule ghoule = new Ghoule("Kaneki", "Ken", "Je suis une Ghoule", 19, "M", true, true, "Je mange des Hamains");
        ghoule.parler();
        ghoule.manger();
    }
}
