package com.company;

/**
 * Created by genie on 20/01/2016.
 */
public class ReturnValue {

    /**
     * public static double area(double radius){
     * <p>
     * double area = Math.PI * radius * radius;
     * <p>
     * return area;
     * }
     */

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }



    public static double absoluteValue(double x){


        if(x < 0){
            System.out.println("yh!!");

            return -x;

        }else
        return x;
    }



}
