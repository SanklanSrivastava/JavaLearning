package demo.packages;

public class Demo {
    public static void main(String[] args){
    //Reverse a program : 23456
        int rev = 7654321;
        int ans = 0;
        while(rev>0) {
            int rem = rev % 10;
            rev = rev / 10;
            ans = ans * 10 + rem;

        }
        System.out.println("reverse is: " +ans);

    }
}
