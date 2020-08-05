package com;

public class ErrorCalculator {
    public static int sum(int a, int b) {
        return (a+b);
    }


    public static double sub(double a, double b) {
        return (a - a); //error
    }

    public static double mul(double a, double b) {
        return (a*b);
    }

    public static double div(double a, double b) {
        return (a*b); // error
    }
}