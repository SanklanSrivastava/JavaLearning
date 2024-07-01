package com.sanklan;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte smallIntegers = 127;   // 1 byte or 8 bits
        short midRangeIntegers = 32767;    // 2 bytes or 16 bits
        char character = 'm';    // 2 bytes or 16 bits
        int integerNumbers = 2147483647;    // 4 bytes or 32 bits
        long largeNumbers = 4532353538888788454L; // 8 bytes, we have to add 'l' or 'L' at the last
        float decimalNumbers = 23.56F; // 4 bytes, we have to add 'f' or 'F' at the last
        double largeDecimalNumbers = 33332525.7867867;  // 8 bytes or 64 bits
        boolean checkTrueFalse = true;  // size of boolean's memory space depends on JVM

        System.out.println(checkTrueFalse);

    }
}
