package com.kodilla.kalkulator;

public class Calculator
{
    public double addition()
    {
        double a = 1.0;
        double b = 2.0;
        return a + b;
    }

    public double subtraction()
    {
        double a = 1.0;
        double b = 2.0;
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("addition: 2 + 1 = "+calculator.addition());
        System.out.println("subtraction: 1 - 2 = "+calculator.subtraction());
    }

}
