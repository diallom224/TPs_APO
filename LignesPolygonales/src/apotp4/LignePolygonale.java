package apotp4;



/**
 * Cette classe représente un ligne polygonale (ligne brisée) avec les contraintes suivantes:
 *
 * - la ligne contient au moins deux sommets et au plus 10 sommets
 * 
 * - les sommets de la ligne sont désigné par un numéro, un nombre entier dans l'intervalle [1..n]
 * où le numéro 1 désigne le sommet origine de la ligne et le numéro n désigne le sommet extrémité
 * de la ligne. Une ligne de n sommets est constituée de n−1 segments, chaque segment reliant le
 * sommet i au sommet i+1 avec i ∈ [1..n−1]
 * 
 * - dans une ligne polygonale, un sommet ne peut apparaitre qu'une seule fois. En d'autres termes,
 * dans une ligne polygonale il ne peut avoir deux sommets ayant des coordonnées identiques,
 *
 * - si des sommets de coordonnées identiques peuvent appraître dans plusieurs lignes polygonales,
 * il n'est pas contre pas possible qu'il apparaisse plusieurs fois dans la même ligne polygonale.
 *
 */
public class LignePolygonale {

    // attributs

    // TODO

    // --------------------------------------------------------------------------
    // Constructeurs (permettent de créer les objets)
    // --------------------------------------------------------------------------
    /**
     * initialise une ligne polygonale avec un segment de droite spécifié par deux points.
     *
     * @param p1 point origine du segment
     * @param p2 point extrémité du segment
     *
     * @throws IllegalOperationException si le segment initial est dégénéré (c'est à dire si le
     *         point origine est confondu avec le point extrémité)
     */
    public LignePolygonale(Point p1, Point p2)  {
throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * initialise une ligne polygonale avec un segment de droite spécifié par les coordonnées
     * cartésiennes de ses deux extrémités.
     *
     * @param x1 abscisse du point origine du segment
     * @param y1 ordonnée du point origine du segment
     * @param x2 abscisse du point extrémité du segment
     * @param y2 ordonnée du point extrémité du segment
     *
     * @throws IllegalOperationException si le segment initial est dégénéré (c'est à dire si le
     *         point origine est confondu avec le point extrémité)
     */
    public LignePolygonale(double x1, double y1, double x2, double y2) {
throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    // --------------------------------------------------------------------------
    // Méthodes
    // --------------------------------------------------------------------------
    /**
     * retourne le sommet origine (le premier sommet) de la ligne polygonale
     *
     * @return le sommet origine
     */
    public Point getOrigine() {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * retourne le sommet extrémité (le dernier sommet) de la ligne polygonale
     *
     * @return le sommet extrémité
     */
    public Point getExtremite() {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * retourne le nombre de points de la ligne polygonale
     *
     * @return nombre de sommets de la ligne polygonale
     */
    public int getNbSommets() {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * ajoute un sommet spécifié par ses coordonnées cartésiennes à la ligne polygonale
     *
     * @param pt sommet ajouté à la ligne polygonale
     *
     * @return la ligne polygonale
     * @throws IllegalOperationException
     *
     * @throws IllegalArgumentException si le sommet ajouté est confondu avec l'un des sommets déjà
     *         existant dans la ligne polygonale
     */
    public LignePolygonale ajouterSommet(Point pt) throws IllegalOperationException {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * ajoute un sommet spécifié par ses coordonnées cartésiennes à la ligne polygonale
     *
     * @param x abscisse du sommet ajouté à la ligne polygonale
     * @param y ordonnée du sommet ajouté à la ligne polygonale
     *
     * @return la ligne polygonale
     * @throws IllegalOperationException
     *
     * @throws IllegalOperationException("sommet déjà present") si le sommet ajouté est confondu
     *         avec l'un des sommets déjà existant dans la ligne polygonale
     * 
     * @throws IllegalOperationException("impossible d'ajouter un nouveau sommet") si la ligne
     *         polygonale contient déjà le nombre maximal de sommets
     */
    public LignePolygonale ajouterSommet(double x, double y) throws IllegalOperationException {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * renvoie le ième sommet de la ligne polygone (i dans l'intervale [1..n]
     *
     * @param i le numéro du sommet à récupérer
     * @return le ième sommet de la ligne polygonale
     *
     * @throws IndexOutOfBoundsException si i n'est pas dans l'intervalle [1..n] où n est le nombre
     *         de sommets de la ligne polygonale.
     */
    public Point getSommet(int i) {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * verifie si la ligne polygonale contient un sommet identique à un point donné.
     *
     * @param pt le point dont on cherche l'appartenance
     * @return true si la ligne a un sommet egale à pt, false sinon
     */
    public boolean contient(Point pt) {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }


    /**
     * permet de supprimer le ième sommet de la ligne, i appartenant à l'intervalle [1..n] où n est
     * le nombre de sommets de la ligne.
     *
     * @param i le numéro du sommet à supprimer
     *
     * @throws IllegalOperationException si la ligne ne contient que deux sommets.
     *
     * @throws IndexOutOfBoundsException si i n'est pas dans l'intervalle [1..n] où n est le nombre
     *         de sommets de la ligne polygonale.
     */
    public void supprimerSommet(int i) {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * retourne la longueur de la ligne polygonale (c'est à dire la somme des longueurs de chacun
     * des segments qui la composent).
     *
     * @return la longueur de la ligne polygonale
     */
    public double getLongueur() {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    /**
     * teste l'égalité de la ligne avec une autre ligne. Deux lignes sont considérées égales si
     * elles ont le même nombre de sommets et que tous les sommets de la première sont identiques
     * aux sommets de la seconde et ce dans le même ordre.
     *
     * @param ligne l'objet LignePolygonale à comparer avec cette ligne
     * @return true si obj est une ligne égale à this, false sinon
     */
    public boolean egale(LignePolygonale ligne) {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }

    // --------------------------------------------------------------------------
    // redéfinition de méthodes héritées de Object
    // --------------------------------------------------------------------------

    /**
     * Renvoie un représentation textuelle chaîne de caractères) de la ligne polygonale, plus
     * précisément les coordonnées de chacun de ses sommets. Par exemple, pour une ligne de 4
     * sommets (0.0,0.0), (14.0,6.0), (25.0,-2.0) et (5.0,-8.0), la chaîne retournée par cette
     * méthode sera :
     * 
     * "LignePolygonale[1:(0.0,0.0),2:(14.0,6.0),3:(25.0,-2.0),4:(5.0,-8.0)]"
     *
     * @return une chaîne de caractères repésentant la ligne polygonale.
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Opération no encore implémentée");
    }


}
