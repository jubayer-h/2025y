package org.example;

import java.util.Scanner;

public class march_1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter your text :");
        String st=input.next();
        //String st="jubayer";
        String rev="";

        for(int i=st.length()-1;i>=0; i--){
           rev= rev+st.charAt(i);
        }
        System.out.println("This is the revese : "+rev);

    }
}
