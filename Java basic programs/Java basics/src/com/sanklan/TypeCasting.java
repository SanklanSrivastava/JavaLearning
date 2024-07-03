package com.sanklan;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting or Widening Type Casting
        int numberInt = 23;
        float floatNumber = numberInt;
        System.out.println("Implicit Type Casting Output is : " +floatNumber);

        // Explicit Type Casting or Narrowing Type Casting
        float numberFloat = 23543.67f;
        int storeFloatNumber = (int) (numberFloat);
        System.out.println(numberFloat);
        System.out.println("Explicit Type Casting Output is : " +storeFloatNumber);

        // Example 2 of Explicit Type Casting
        long longNumber = 87776687l;
        int intNumber = (int) longNumber;
        System.out.println("Second explicit example output is : " +intNumber);


    }
}
