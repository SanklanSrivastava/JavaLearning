package com.sanklan;

import java.util.Scanner;

public class UserInput {

//  <<<<<<<<<<<<<<<<<<<  User input for an integer   >>>>>>>>>>>>>>>>>>>>>>>

//    public static void main(String[] args){
//        System.out.print("Please enter a natural number : ");
//        Scanner integerInput = new Scanner(System.in);
//        System.out.println("Your desired output is : " +integerInput.nextInt());
//    }


//  <<<<<<<<<<<<<<<<<<<<<< User input for a String  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public static void main(String[] args){
        System.out.print("Please enter a String : ");
        Scanner stringInput = new Scanner(System.in);
        System.out.println("Your desired output is : " +stringInput.next()); // prints word till first space
        System.out.println("Your desired output is : " +stringInput.nextLine());   // prints the entire line
    }
}
