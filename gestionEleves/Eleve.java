import java.util.ArrayList ;

public class Eleve {
	private String nom;
	private ArrayList<Integer> listeNotes = new ArrayList<Integer>();
	private double moyenne ;

	public Eleve(String nom){this.nom = nom;}

	public double getMoyenne(){
		return this.moyenne;
	}

	public String getNom(){
		return this.nom;
	}


	public ArrayList<Integer> getListNotes(){
		return this.listeNotes;
	}

	public void ajouterNote(int note){
	    if (note < 0) {
	        note = 0;
	    } else if (note > 20) {
	        note = 20;
	    }

	    listeNotes.add(note);

	    int somme = 0;
	    for (int i = 0; i < listeNotes.size(); i++) {
	        somme += listeNotes.get(i);
	    }

	    this.moyenne = (double) somme / listeNotes.size();
	}



	@Override
	public String toString() {
	return nom + " (" + (int)(100 * moyenne)/100.0 + ")";
    }

}