package org.example;

public class reverse2 {
    public static void main(String[] args) {

//reversing word by word
        System.out.println(" Reverse word by words -------------");

        String input = "welcom to house";
        String a[] = input.split(" ");//(" _" ) this tell where should i split (where is the space)
        //3 for loop
        String str1=" " ;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println( " ");
        System.out.println(" ------------- ");
        for (int i =a.length-1; i>=0; i--) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ------------- ");
        System.out.println(" instead print directly we can crate another string ");
        System.out.println(" 3.------------- ");
        for (int i =a.length-1; i>=0; i--) {
            str1=str1+a[i]+" ";
        }
        System.out.println(str1);
    }
}