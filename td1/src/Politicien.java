public class Politicien {

    void ticien(String parametre) {
        System.out.println("- À l'intérieur de ticien");
        System.out.println("- avant toUpperCase : parametre = " + parametre);
        parametre = parametre.toUpperCase();
        System.out.println("- après toUpperCase : parametre = " + parametre);
    }

}
