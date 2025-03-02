package org.example;

import java.util.Scanner;

public class march_1_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number :");
        int a=input.nextInt();


        if(a%2==0){
            System.out.println("even is "+a);

        }
       else {
            System.out.println("odd");
        }
        System.out.println("-end-"+a);
    }
}
