package bataille;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Classe d'interface graphique pour le jeu de bataille.
 * Utilise un répertoire "images" contenant les faces des cartes.
 *
 * Contient le main.
 * Vous ne pouvez lancer le main que lorsque toutes les classes ont été complétées
 * (au moins avec les attributs et les signatures des méthodes).
 *
 * Vous devez  compléter dans cette classe
 * 1- la méthode void afficheCarteJoueur(PlaceJoueur joueur, Carte carte)
 * Cette méthode affiche la carte carte sur le label de la carte gauche (carteJoueurGaucheLabel)
 * si joueur == PlaceJoueur.GAUCHE ou sur le label de la carte droite (carteJoueurDroiteLabel) si
 * joueur == PlaceJoueur.DROITE.
 * 	Tip: pour afficher une carte sur un label label, il faut utiliser la méthode
 *    label.setIcon(new ImageIcon(fileName)) où fileName est le nom du fichier où trouver
 *    l'image correspondant à la carte. Attention, fileName doit contenir PATH_TO_IMAGES.
 *
 * 2- la méthode jouer()
 * Cette méthode est la méthode appelée lorsque l'on clique sur le bouton jouer.
 * Cette méthode implémente un tour de jeu de bataille:
 * 	- distribution des cartes aux 2 joueurs
 *  - les 2 joueurs jouent
 *  - affichage des cartes jouées par chaque joueur
 *  - affichage d'un commentaire sous la forme:
 *  	"nomDuJoueurGauche joue un(e) nomDeLaCarteJouéeParLeJoueurGauche\n
 *  	 nomDujoueurDroite joue un(e) nomDeLaCarteJouéeParLeJoueurDroite."
 *    par exemple:
 *    	Anna Tomie joue un(e) roi de trèfle
 *    	Guy de Michelin joue un(e) as de pique
 *
 *    Tip: pour écrire un commentaire, utiliser la méthode setText(s: String)
 *    de la classe JLabel sur l'attribut commentaire.
 *
 * 3- la méthode remporter()
 * Cette méthode est la méthode appelée lorsque l'on clique sur le bouton remporter.
 * Cette méthode implémente ce qu'il se passe lorsque les 2 joueurs ont joués et que l'un d'eux remporte.
 * 	- Appel la méthode gagnant() de la classe Bataille
 *  - S'il y a bataille, écrit un commentaire "Bataille ! on rejoue..."
 *  - Sinon, écrit "C'est le joueur nomDujoueurQuiRemporte qui remporte le pli." et
 *  	vide le set de jeu de ses cartes.
 *
 *    Tip: pour écrire un commentaire, utiliser la méthode setText(s: String)
 *    de la classe JLabel sur l'attribut commentaire.
 *    Tip: pour effacer une carte, il suffit de faire un setIcon(null) sur le label correspondant.
 *
 * @author cfouard
 * @author Ph. Genoud
 */
public class BattaileGUI {

    static final String PATH_TO_IMAGES = "images/";

    Bataille bataille;

    JFrame frameJeuDeBataille;
    JLabel commentaire;
    JLabel carteJoueurGaucheLabel;
    JLabel carteJoueurDroiteLabel;
    JButton btnJouer;
    JButton btnRemporter;

    BattaileGUI(String nomGauche, String nomDroite) {
        bataille = new Bataille(nomGauche, nomDroite);
        // A laisser ici, permet d'initialiser l'Interface
        // utilise nomGauche et nomDroite
        initFrame();
    }

    void afficheCarteJoueur(PlaceJoueur joueur, Carte carte) {
        // A compléter
    }

    void jouer() {
        // A compléter
        try {
            bataille.distribue();
            bataille.jouerUnTour();
            afficheCarteJoueur(PlaceJoueur.GAUCHE, bataille.carteGauche);
            afficheCarteJoueur(PlaceJoueur.DROITE, bataille.carteDroite);
            String comment = "" + bataille.joueurGauche.getNom() + " joue un(e) " + bataille.carteGauche.getNom();
            comment += "\n" + bataille.joueurDroite.getNom() + " joue un(e) " + bataille.carteDroite.getNom();
            commentaire.setText(comment);
            btnJouer.setEnabled(false);
            btnRemporter.setEnabled(true);
        } catch (JoueurException e) {
            // ne devrait jamais arriver
            e.printStackTrace();
            System.exit(0);
        }
    }

    void remporter() {
        // A compléter
    }

    void initFrame() {
        String nomGauche = bataille.joueurGauche.getNom();
        String nomDroite = bataille.joueurDroite.getNom();
        frameJeuDeBataille = new JFrame();
        frameJeuDeBataille.getContentPane().setMinimumSize(new Dimension(1000, 550));
        frameJeuDeBataille.getContentPane().setPreferredSize(new Dimension(1000, 550));
        frameJeuDeBataille.setTitle("Jeu de Bataille");
        frameJeuDeBataille.getContentPane().setBackground(new Color(0, 100, 0));
        frameJeuDeBataille.getContentPane().setLayout(new BoxLayout(frameJeuDeBataille.getContentPane(), BoxLayout.Y_AXIS));
        JPanel joueursPanel = new JPanel();
        frameJeuDeBataille.getContentPane().add(joueursPanel);
        joueursPanel.setLayout(new BoxLayout(joueursPanel, BoxLayout.X_AXIS));
        JPanel joueur1Panel = new JPanel();
        joueur1Panel.setBackground(new Color(100, 149, 237));
        joueursPanel.add(joueur1Panel);
        joueur1Panel.setLayout(new BoxLayout(joueur1Panel, BoxLayout.Y_AXIS));
        JLabel labelJoueur1 = new JLabel(nomGauche);
        labelJoueur1.setHorizontalAlignment(SwingConstants.CENTER);
        joueur1Panel.add(labelJoueur1);
        JPanel joueur1CartesPanel = new JPanel();
        joueur1CartesPanel.setPreferredSize(new Dimension(500, 400));
        joueur1CartesPanel.setMinimumSize(new Dimension(500, 400));
        joueur1CartesPanel.setBackground(new Color(0, 100, 0));
        joueur1Panel.add(joueur1CartesPanel);
        joueur1CartesPanel.setLayout(new GridLayout(1, 0, 20, 0));
        JLabel tasJoueurGaucheLabel = new JLabel();
        tasJoueurGaucheLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tasJoueurGaucheLabel.setPreferredSize(new Dimension(240, 360));
        tasJoueurGaucheLabel.setMaximumSize(new Dimension(240, 360));
        tasJoueurGaucheLabel.setMinimumSize(new Dimension(240, 360));
        tasJoueurGaucheLabel.setIcon(new ImageIcon(PATH_TO_IMAGES + "dos-de-carte.png"));
        joueur1CartesPanel.add(tasJoueurGaucheLabel);
        carteJoueurGaucheLabel = new JLabel();
        carteJoueurGaucheLabel.setHorizontalAlignment(SwingConstants.CENTER);
        carteJoueurGaucheLabel.setPreferredSize(new Dimension(240, 360));
        carteJoueurGaucheLabel.setMaximumSize(new Dimension(240, 360));
        carteJoueurGaucheLabel.setMinimumSize(new Dimension(240, 360));
        joueur1CartesPanel.add(carteJoueurGaucheLabel);
        JPanel joueur2Panel = new JPanel();
        joueur2Panel.setBackground(new Color(245, 222, 179));
        joueursPanel.add(joueur2Panel);
        joueur2Panel.setLayout(new BoxLayout(joueur2Panel, BoxLayout.Y_AXIS));
        JLabel labelJoueur2 = new JLabel(nomDroite);
        labelJoueur2.setHorizontalAlignment(SwingConstants.CENTER);
        joueur2Panel.add(labelJoueur2);
        JPanel joueur2CartesPanel = new JPanel();
        joueur2CartesPanel.setPreferredSize(new Dimension(500, 400));
        joueur2CartesPanel.setMinimumSize(new Dimension(500, 400));
        joueur2CartesPanel.setBackground(new Color(0, 100, 0));
        joueur2Panel.add(joueur2CartesPanel);
        joueur2CartesPanel.setLayout(new GridLayout(1, 0, 20, 0));
        carteJoueurDroiteLabel = new JLabel();
        carteJoueurDroiteLabel.setHorizontalAlignment(SwingConstants.CENTER);
        carteJoueurDroiteLabel.setPreferredSize(new Dimension(240, 360));
        carteJoueurDroiteLabel.setMaximumSize(new Dimension(240, 360));
        carteJoueurDroiteLabel.setMinimumSize(new Dimension(240, 360));
        joueur2CartesPanel.add(carteJoueurDroiteLabel);
        JLabel tasJoueurDroiteLabel = new JLabel();
        tasJoueurDroiteLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tasJoueurDroiteLabel.setPreferredSize(new Dimension(240, 360));
        tasJoueurDroiteLabel.setMaximumSize(new Dimension(240, 360));
        tasJoueurDroiteLabel.setMinimumSize(new Dimension(240, 360));
        tasJoueurDroiteLabel.setIcon(new ImageIcon(PATH_TO_IMAGES + "dos-de-carte.png"));
        joueur2CartesPanel.add(tasJoueurDroiteLabel);
        JPanel commentairePanel = new JPanel();
        commentairePanel.setBackground(new Color(0, 100, 0));
        frameJeuDeBataille.getContentPane().add(commentairePanel);
        commentairePanel.setLayout(new BoxLayout(commentairePanel, BoxLayout.X_AXIS));
        commentaire = new JLabel("Commentaire");
        commentairePanel.add(commentaire);
        JPanel boutonsPanel = new JPanel();
        frameJeuDeBataille.getContentPane().add(boutonsPanel);
        boutonsPanel.setLayout(new BoxLayout(boutonsPanel, BoxLayout.X_AXIS));
        btnJouer = new JButton("Jouer");
        btnJouer.setEnabled(true);
        btnJouer.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jouer();
            }
        });
        boutonsPanel.add(btnJouer);
        btnRemporter = new JButton("Remporter");
        btnRemporter.setEnabled(false);
        btnRemporter.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                remporter();
            }
        });
        btnRemporter.setEnabled(false);
        boutonsPanel.add(btnRemporter);
        commentaire.setForeground(new Color(255, 255, 240));
        commentaire.setHorizontalAlignment(SwingConstants.CENTER);
        frameJeuDeBataille.setBounds(100, 100, 1054, 490);
        frameJeuDeBataille.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    BattaileGUI window = new BattaileGUI("Anna Tomie", "Guy de Michelin");
                    window.frameJeuDeBataille.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
