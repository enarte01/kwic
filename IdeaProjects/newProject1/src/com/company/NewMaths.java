package com.company;

public class NewMaths {

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println("");
            nLines(n - 1);
        }
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);
        zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop");
        } else {
            System.out.println("ik");
            baffle(quince);
            System.out.println("boo-wa-ha-ha");
        }

    }


    public static int countBeer(int b) {

        if (b > 1) {

            System.out.println(b + " bottles of beer on the wall," + b + " bottles of beer, ya' take one down," +
                    " ya' pass it around ");

            countBeer(b - 1);

        } else if (b == 1) {

            System.out.println(b + " bottle of beer on the wall," + b + " bottle of beer, ya' take one down," +
                    " ya' pass it around ");

            countBeer(b - 1);

        } else if (b == 0) {


            System.out.println("No bottles of beer on the wall, no bottles of beer, ya' can't take " +
                    "one down, ya' can't ");
            System.out.println("pass it around, 'cause there are no more " +
                    "bottles of beer on the wall!");
        }


        return 0;
    }

    public static void zoop(String fred, int bob){

        System.out.println(fred);

        if(bob == 5){

            ping("not ");

        }else {

            System.out.println("!");
        }
    }

    public static void clink(int fork){

        System.out.println("it's ");
        zoop("breakfast ", fork);

    }

    public  static void ping(String strangeStrung){

        System.out.println("sny " + strangeStrung + "more ");
    }


    public  static void checkFermant(double a, double b, double c, double n) {

        int ap = (int)raiseToPow(a,n);
        System.out.println(ap);
        int bp = (int)raiseToPow(b,n);
        System.out.println(bp);
        int cp = (int)raiseToPow(c,n);
        System.out.println(cp);




        boolean isTure;
        if ((ap + bp) == cp) isTure = true;
        else isTure = false;

        if (isTure && n > 2) {

            System.out.println("Holy smokes, Fermat was wrong!");


        } else if (isTure) {


            System.out.println("Fermant was right! ");
        } else {


            System.out.println("That doesn't work ");
        }
    }
         public  static double raiseToPow(double x, double y){

        double result = Math.pow(x,y);


             System.out.println(result);


             return result;

    }
}





