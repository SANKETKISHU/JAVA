package com.example;

public class Calculation {

    public static int add(int x, int y) {return x+y;}
    public static int subtract(int x, int y) {return x-y;}
    public static int multiply(int x, int y) {return x*y;}
    public static int divide(int x, int y) {return x/y;}

    public static float add(float x, float y) {return x+y;}
    public static float subtract(float x, float y) {return x-y;}
    public static float multiply(float x, float y) {return x*y;}
    public static float divide(float x, float y) {return x/y;}

    public static int add(int x, int y, int z) {return x+y+z;}
    public static int subtract(int x, int y, int z) {return x-y-z;}
    public static int multiply(int x, int y, int z) {return x*y*z;}
    public static int divide(int x, int y, int z) {return (x/y)/z;}

    public static float add(float x, float y, float z) {return x+y+z;}
    public static float subtract(float x, float y, float z) {return x-y-z;}
    public static float multiply(float x, float y, float z) {return x*y*z;}
    public static float divide(float x, float y, float z) {return (x/y)/z;}

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));

        System.out.println(subtract(10,20));
        System.out.println(subtract(10,20,30));

        System.out.println(multiply(10,20));
        System.out.println(multiply(10,20,30));

        System.out.println(divide(30,10));
        System.out.println(divide(30,10,5));
    }
    
}
