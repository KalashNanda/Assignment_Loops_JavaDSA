package Assignment_Loops;

import java.util.Scanner;

public class Ques2_MutiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int mul = 0;
        for(int i=1;i<=10;i++){
            System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
        }
        System.out.println();
    }
}
