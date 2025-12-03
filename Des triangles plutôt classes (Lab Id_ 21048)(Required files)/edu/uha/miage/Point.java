/*
 * @author : Yvan Maillot (yvan.maillot@uha.fr)
 */
package edu.uha.miage;

public class Point {
    // TODO 1.01. Déclarer x et y, les coordonnées cartésiennes de ce point
    private  double x;
    private double y;


    // TODO 1.02. Écrire le constructeur aux coordonnées cartésiennes
    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    // TODO 1.03. Écrire un getter pour x
    public double getX(){
        return x;
    }
    // TODO 1.04. Écrire un getter pour y
    public double getY(){
       return y;
    }
    // TODO 1.05. Écrire un setter pour x
    public void setX(double x){
        this.x = x ;
    }
    // TODO 1.06. Écrire un setter pour y
    public void setY(double y){
        this.y = y ;
    }
    // TODO 1.07. public toString() qui retourne par exemple (2.5, 3.2)
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
