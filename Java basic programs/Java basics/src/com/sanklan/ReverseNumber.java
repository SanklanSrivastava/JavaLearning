package com.sanklan;

public class ReverseNumber {
    public static void main(String[] args) {
        int reverseNum = 98765;
        int ans = 0;
        while(reverseNum > 0){
            int rem = reverseNum % 10;
            reverseNum = reverseNum/10;
            ans = ans* 10 + rem;
        }
        System.out.println("Reverse number will be : " +ans);
    }
}
