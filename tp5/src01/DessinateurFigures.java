public class DessinateurFigures {

	
    void rectangle(int largeur, int hauteur) {
    
		for (int i = 1;i <= hauteur ;i++ ){
			for (int j = 1; j <= largeur ;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
        
    }


   
    void triangleGauche(int hauteur) {
        for(int i = 1 ; i <= hauteur;i++){
            for (int j = 0; j < i; j++ ){
            System.out.print("*");
            }
            System.out.println();
        }
    }

    void triangleDroite(int hauteur) {
    // TODO
        for(int i = 1 ; i <= hauteur;i++){
            for(int j = 0 ;j < hauteur-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++ ){
            System.out.print("*");
            }
            System.out.println();
        }
    
    }

        void triangleIso(int hauteur) {
        for (int i = 1; i <= hauteur; i++) {
           
            for (int j = 0; j < hauteur - i; j++) {
                System.out.print(" ");
            }
    
          
            if (i == 1) {
                System.out.println("*");
            }
            else {
                System.out.print("*");
                for (int j = 0; j < 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }


}