package com.kodilla.kalkulator;

public class Calculator
{
    public double addition(double a, double b)
    {
        return a + b;
    }

    public double subtraction(double a, double b)
    {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 5.0;
        double num2 = 3.0;

        System.out.println("addition: " + num1 + " + " + num2 + " = "+calculator.addition(num1, num2));
        System.out.println("subtraction: " + num1 + " - " + num2 + " = "+calculator.subtraction(num1, num2));
    }

}
