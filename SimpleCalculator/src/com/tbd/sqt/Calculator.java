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

        Change from: Prachi Adhwaryu [500202018]
        Function: Subtraction of two arguments
        Arguments: Two double arguments
        Output: One double value
    */
    public void subtraction(double number1, double number2) {
        try {
            if (number1 > number2)
                result = number1 - number2;
            else
                result = number2 - number1;
        } catch (Exception e) {

            System.out.println("Invalid Input");
        }
    }
   
    /*Author: Rohini Bansal
    ID: 500209290
    Function : Addition Operation between 2 numbers
    Arguments : user input numbers 2 double values
    Result : one double value
     */
    public void add(double number1, double number2){
        try{
            result= number1 + number2;

        }catch(Exception e){

            System.out.println("Invalid Input");
        }
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

    /*
        Change from: Anumahal
        Function that receives two int arguments
        arguments: Two double arguments
        return: One double value
    */
    public void multiplication(double number1, double number2)
    {
        try {
            result = number1 * number2;
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    public void calc(String operator){
        switch(operator)
        {
             case("+"): //Rohini Bansal
                add(number1, number2);
                break;

            case("-"): // Prachi Adhwaryu [500202018]
                subtraction(number1, number2);
                break;
            
            case("*"): // Anumahal
                multiplication(number1, number2);
            break;
            
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
        System.out.printf("Result is: %s \n", result);
    }
}
