

public class Statistiques<T extends Evaluable> {
    protected T[] tableau;



    /**
        le constructeur pour reinitialiser mon tableau.
        
     */
    public Statistiques(T[] tableau) {
        this.tableau = tableau;
    }


    // ma methode qui sert a afficher une valeur
    // @return : void 
    public void afficherValeurs() {
        for (T element : tableau) {
            System.out.println(element + " -> " + element.valeur());
        }
    }
    /**
     *  Cette methode return le min de ma tableau
     * @return : minimum du tableau
     * @return : IndexOfBoundExeception
    */
    public T min() {
        if (tableau.length<0)
            throw new IndexOutOfBoundsException(" tableau est vide ");

        T min = tableau[0];
        for (T maTableau : tableau) {
            if (maTableau.valeur() < min.valeur())
                min = maTableau;
        }
        return min;
    }


    /**
    *Cette methode return le max de ma tableau
    *@return : max
    */
    public T max() {
        if (tableau.length<0)
            throw new IndexOutOfBoundsException(" tableau est vide ");

        T max = tableau[0];
        
        for (T element : tableau) {
            if (element.valeur() > max.valeur()) max = element;
        }
        return max;
    }
    /**
     * @return : la moyenne
     * @return : IndexOutOfBoundsException
     */
    public double moyenne() {
        if (tableau.length<0)
            throw new IndexOutOfBoundsException(" tableau est vide ");

        double somme = 0.0;
        for (T element : tableau) 
            somme += element.valeur();
        return somme / tableau.length;
    }


    /**
     * @return : la variance
     * @return : IndexOutOfBoundsException
     */
    public double variance() {
        if (tableau.length<0)
            throw new IndexOutOfBoundsException(" tableau est vide ");

        double moy = moyenne();
        double somme = 0;

        for (T element : tableau) {
            double diff = element.valeur() - moy;
            somme += diff * diff;
        }
        return somme / tableau.length;
    }
}
