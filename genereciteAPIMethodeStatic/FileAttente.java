import java.util.ArrayList;

public class FileAttente<T> {
    private ArrayList<T> contenu = new ArrayList<>();

    public void entre(T element) { contenu.add(element); }

    public T sort() {
        if(contenu.isEmpty()) return null;
        return contenu.remove(0);
    }

    public boolean estVide() { return contenu.isEmpty(); }

    @Override
    public String toString() { return contenu.toString(); }
}
