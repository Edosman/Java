/**
 * Java. Level 1. Lesson 1. Home work
 *
 * @author Andry Krasikov
 * @version Aug 11, 2018
 */

public class HomeWork1 {
    public static void main (String[] args){

        int number = 14;
        byte temp = -21;
        short year = 1945;
        long bankaccount = 678975787;
        double price = 565.75345;
        float pressure = 7899.7090f;
        char simb = 'A';
        boolean istrue = true;
        String name = "Андрей";

        System.out.println(arithExpr (5,6,8,2));
        System.out.println(limit10_20 (1,5));
        positiveOrNegative (number);
        System.out.println(negative (temp));
        name (name);
        leapYear (year);
    }

    public static int arithExpr (int a, int b, int c, int d) { //может и не int а float или double?
        return a*(b+(c/d));
    }

    public static boolean limit10_20 (int x, int y) {
        return (10<=x+y && 20>=x+y);
    }

    public static void positiveOrNegative (int number) {
        if (number<0) {
            System.out.println("Число отрицательное");
        }
        System.out.println("Число положительное");
    }

    public static boolean negative (int integer) {
        return (integer < 0);
    }

    public static void name (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear (short year) {
        if (year%4!=0){
            System.out.print("Год не високосный");
        } else if (year%100!=0) {
            System.out.print("Год является високосным");
        } else if (year%400!=0) {
            System.out.print("Год не високосный");
        } else {
            System.out.print("Год является високосным");
        }
    }
}