package bataille;

import java.util.Scanner;

/** 
 * Pour tester en  ligne de commande avec du texte
*/
public class BatailleCLI {
    public static void main(String[] args) throws JoueurException {

		Scanner scanner = new Scanner(System.in);
        Bataille bataille = new Bataille("Anna Tomie", "Guy de Michelin");

		String reponse = "non";
		do {
            // TODO simuler un tour de bataille

			System.out.print("Voulez-vous rejouer ? (o/n ou oui/non) ");
			reponse = scanner.next();
		} while (reponse.toLowerCase().startsWith("o"));

        scanner.close();
    }

}