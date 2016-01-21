package com.company;

import org.jetbrains.annotations.Contract;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

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


   //@Contract(pure = true)
    public static boolean isSingleDigit(int x) {
        return x >= 0 && x < 10;
    }


    public static int shouldBeSingle(int x){

        if(isSingleDigit(x)){

            System.out.println("This is quiet small");
        }else System.out.print("This is quiet big !!!");


        return 0;
    }

    public static int factorial(int x){

        if(x == 0){

            return 1;

        }else {

            int f = factorial(x-1);

            return  x * f;

        }

    }

    public static int fibonacci(int x){

        if(x == 0 || x == 1 ){

            return 1;

    }else return factorial(x- 1) + factorial(x -2);

  }

}

