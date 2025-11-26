public class B extends A {
	private int v ;

	public B() {
	System.out.println ( " > Constructeur de B () " );
		v = 5;
	 	afficher();
	}

	public void afficher() {
	 	System.out.println ("> v = "+v);  
	}
	
	
}