public class Compteur {
    private int value;
    private static Compteur instance = null;

    private Compteur() {
        value = 0; 
    }

    public static Compteur getInstance() {
        if (instance == null)
            instance = new Compteur();
        return instance;
    }

    public int incremente() { return ++value; }
    public int decremente() { return --value; }
    public int getValue() { return value; }

    @Override
    public String toString() { return "[Compteur : " + value + "]"; }
}
