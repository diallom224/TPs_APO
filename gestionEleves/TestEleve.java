class TestEleve {
    public static void main(String[] arg) {

        if (arg.length < 2) {
            System.out.println("Usage : java TestEleve <nom> <note1> <note2> ...");
            return;
        }

        Eleve eleve = new Eleve(arg[0]);

        for (int i = 1; i < arg.length; i++) {
            eleve.ajouterNote(Integer.parseInt(arg[i]));
            System.out.println("Moyenne de " + eleve.getNom() +
                    " : " + eleve.getMoyenne());
        }

        System.out.println(eleve);
    }
}
