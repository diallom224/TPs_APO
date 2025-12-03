

package quincaillerie;



public class Quincaillerie {
    public static void main(String[] args) {
        PieceDeBase pneu = new PieceDeBase("pneu", "04741", 12.5, 60, 2);
        PieceDeBase chambreAir = new PieceDeBase("chambre à air", "4565", 4.0, 20, 2);
        PieceDeBase disqueJante = new PieceDeBase("disque de jante", "1214", 4.5, 60, 2);
        PieceDeBase rayon = new PieceDeBase("rayon", "04748", 1.0, 20, 1);

        PieceCompositeEnKit janteKit = new PieceCompositeEnKit("jante en kit", "14541", 10);
        janteKit.ajoute(disqueJante);
        janteKit.ajoute(rayon);
        janteKit.ajoute(rayon);
        janteKit.ajoute(rayon);

        PieceCompositeEnKit roueBrouetteKit = new PieceCompositeEnKit("roue de brouette en kit", "11512", 15);
        roueBrouetteKit.ajoute(pneu);
        roueBrouetteKit.ajoute(chambreAir);
        roueBrouetteKit.ajoute(janteKit);

        System.out.println("=== Jante en kit ===");
        janteKit.affiche();

        System.out.println("=== Roue de brouette en kit ===");
        roueBrouetteKit.affiche();
    }
}
