package com.company;

/**
 * Created by genie on 20/01/2016.
 */
public class Distance {

    public static double distance(double x1, double y1, double x2, double y2){

        double dx = x2 - x1;
        double dy = y2 - y1;

        //System.out.println("dx is " + dx);
        //System.out.println("dy is " + dy);
        double dsquared = dx*dx + dy*dy;
       // System.out.println("dsquared is " + dsquared);

        double result = Math.sqrt(dsquared);



        return result;
    }

    public static double area(double radius ){

        double area = Math.PI * (radius * radius);

        //System.out.println(area);

        return area;

    }

    public static double area(double xc, double yc, double xp, double yp){

      //double  radius = distance(xc, yc, xp, yp);

        //System.out.println(radius);

        //double area = area(radius);

        /* System.out.println(area); */

        return area(distance(xc, yc, xp, yp));
    }


}
