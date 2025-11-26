public class TestFileAttente {
    public static void main(String[] args) {
        FileAttente<Personne> file = new FileAttente<>();
        file.entre(new Personne("Alice", 25));
        file.entre(new Personne("Bob", 30));
        file.entre(new Personne("Charlie", 22));

        System.out.println("File : " + file);

        Personne p = file.sort();
        System.out.println("Sorti : " + p);
        System.out.println("File après sortie : " + file);
    }
}
