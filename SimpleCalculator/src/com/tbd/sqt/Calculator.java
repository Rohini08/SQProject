package com.tbd.sqt;

public class Calculator {

    private double number1;
    private double number2;
    private double result;

    // Change from: Julian Gil
    public Calculator (double num1, double num2) {
        number1 = num1;
        number2 = num2;
    }

    /*
        Change from: Julian Gil
        Function that receives two int arguments
        arguments: Two double arguments
        return: One double value
    */
    public void division(double number1, double number2)
    {
        try {
            result = number1 / number2;
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    public void calc(String operator){
        switch(operator)
        {
            case("/"): // Julian Gil
                division(number1, number2);
                break;
        }
    }

    /*
        Change from: Julian Gil
        Function that returns result attribute
    */
    public void getResult() {
        System.out.printf("Result is: %s \n", result);;
    }
}
