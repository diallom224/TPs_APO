/*
 * @author : Yvan Maillot (yvan.maillot@uha.fr)
 */
package edu.uha.miage;

public class Triangle {
    // TODO 3.01. Les trois segments du triangle : s1, s2, s3
   
    private Segment s1;
    private Segment s2;
    private Segment s3;


    // TODO 3.02. Écrire le constructeur avec ses trois sommets
    public Triangle(Point p1, Point p2, Point p3) {
        this.s1 = new Segment(p1, p2);
        this.s2 = new Segment(p2, p3);
        this.s3 = new Segment(p3, p1);
    }
    // TODO 3.03. getP1() qui retourne le premier sommet de ce triangle
    public Point getP1() { return s1.getP1(); }
    // TODO 3.04. getP2() qui retourne le deuxième sommet de ce triangle
    public Point getP2() { return s1.getP2(); }
    // TODO 3.05. getP3() qui retourne le troisième sommet de ce triangle
    public Point getP3() { return s2.getP2(); }
    // TODO 3.06. setP1() qui met à jour le premier sommet de ce triangle
    public void setP1(Point p1) {
        s1 = new Segment(p1, s1.getP2());
        s3 = new Segment(s3.getP1(), p1);
    }
    // TODO 3.07. setP2() qui met à jour le deuxième sommet de ce triangle
    public void setP2(Point p2) {
    s1 = new Segment(s1.getP1(), p2); // mettre à jour s1
    s2 = new Segment(p2, s2.getP2()); // mettre à jour s2
}

    // TODO 3.08. setP3() qui met à jour le troisième sommet de ce triangle
    public void setP3(Point p3) {
        s2 = new Segment(s2.getP1(), p3);
        s3 = new Segment(p3, s3.getP2());
    }
    // TODO 3.05. Retourner le périmètre de ce triangle
    public double getPerimetre() {
        return s1.getLongueur() + s2.getLongueur() + s3.getLongueur();
    }

    // TODO 3.06. Retourner la surface de ce triangle
    public double getSurface() {
        double a = s1.getLongueur();
        double b = s2.getLongueur();
        double c = s3.getLongueur();
        
        double s = (a + b + c) / 2.0; // demi-périmètre
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // TODO 3.07. Retourner le barycentre de ce triangle
    public Point getBaryCentre() {
        double x = (s1.getP1().getX() + s1.getP2().getX() + s2.getP2().getX()) / 3.0;
        double y = (s1.getP1().getY() + s1.getP2().getY() + s2.getP2().getY()) / 3.0;
        return new Point(x, y);
    }




    // TODO 3.08. La méthode toString()
    @Override
    public String toString() {
        return "<[" + s1.toString() + "],[" + s2.toString() + "],[" + s3.toString() + "]>";
    }

}
