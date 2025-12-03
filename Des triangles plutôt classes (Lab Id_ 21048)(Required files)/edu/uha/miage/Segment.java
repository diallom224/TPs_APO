/*
 * @author : Yvan Maillot (yvan.maillot@uha.fr)
 */
package edu.uha.miage;

/**
 * @author yvan
 */
public class Segment {
    // TODO 2.01. Déclarer les attributs p1 et p2, les extrémités de ce segment
    private Point p1;
    private Point p2;
    // TODO 2.02. Écrire le constructeur attendant les extrémités de ce segment
    public Segment(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    // TODO 2.03. Écrire un getter pour chaque extrémité
    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }
    // TODO 2.04. Écrire un setter pour chaque extrémité
    public void setP1(Point p1){
        this.p1 = p1;
    } 

    public void setP2(Point p2){
        this.p2 = p2;
    }
    // TODO 2.05. Écrire getLongueur() qui retourne la longueur de ce segment
    public double getLongueur(){
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    // TODO 2.06. Redéfinir toString() une représentation de ce segment comme demandé dans l'énoncé, Par exemple [(1.2, 3.4) ; (4.5, 5.6)]
    @Override
    public String toString() {
        return "[" + p1.toString() + ";" + p2.toString() + "]";
    }
}
