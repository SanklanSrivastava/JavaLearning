package com.sanklan;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sal = new Scanner(System.in);
        System.out.print("Please enter your salary amount : ");
        float salary = sal.nextFloat();
        System.out.println("Your current salary amount is : " +salary);
        if(salary > 10000){
            float incSal = salary + 2000;
            System.out.println("You will recieve a bonus of 2000 : " +incSal);
        }
        else {
            float incLessSal = salary + 500;
            System.out.println("You will receive a bonus of 500 : " +incLessSal);
        }

        // else if condition
        Scanner takeInput = new Scanner(System.in);
        System.out.print("Please enter a natural number: ");
        int inputNum = takeInput.nextInt();
        if(inputNum < 25){
            System.out.println("It is smaller");
        }
        else if (inputNum == 25){
            System.out.println("You got the number");
        }
        else {
            System.out.println("It is bigger");
        }
    }
}
