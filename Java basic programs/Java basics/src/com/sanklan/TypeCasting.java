package com.sanklan;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting or Widening Casting
        int numberInt = 23;
        float floatNumber = numberInt;
        System.out.println("Implicit Type Casting Output is : " +floatNumber);

        // Explicit Type Casting or Narrowing Casting
        float numberFloat = 23543.67f;
        System.out.println(numberFloat);
        int storeFloatNumber = (int) (numberFloat);
        System.out.println("Explicit Type Casting Output is : " +storeFloatNumber);
    }
}
