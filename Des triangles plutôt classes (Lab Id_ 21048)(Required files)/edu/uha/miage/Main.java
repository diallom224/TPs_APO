/*
 * @author : Yvan Maillot (yvan.maillot@uha.fr)
 */
package edu.uha.miage;

/**
 * @author yvan
 */
public class Main {

    public static void main(String[] args) {
        double x = 10.0;
        double y = 20.0;
        double x1 = 2.0;
        double y1 = 8.0;
        double x2 = 23.0;
        double y2 = 3.0;

        Point p = new Point(x, y);
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        p.setX(x);
        p.setY(y);
        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);

        System.out.println(p);



    
        Segment s1 = new Segment(p, p1);
        Segment s2 = new Segment(p,p2);
        Segment s3 = new Segment(p2,p1);


        Triangle t = new Triangle(p, p1, p2);
        System.out.println(s1);

        System.out.println(t);

    }
}
