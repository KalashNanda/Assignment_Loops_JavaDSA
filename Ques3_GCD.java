package Assignment_Loops;

import java.util.Scanner;

public class Ques3_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n = sc.nextInt();
        System.out.print("Enter second number : ");
        int m = sc.nextInt();
        int k = Math.min(n,m);
        for(int i=k;i>0;i--){
            if(n%i==0 && m%i==0) {
                System.out.println("GCD (Greatest Common Divisor) of two numbers is " + i);
                break;
            }
        }
    }
}