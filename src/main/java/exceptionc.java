import org.apache.xmlbeans.soap.SOAPArrayType;

import java.util.Scanner;

public class exceptionc {
    public static void main(String[] args) {
while (true) {
    try {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = input.nextInt();
    } catch (Exception e) {
        System.out.println(e);
        System.out.println("Try again ");
        System.out.println(" this is  last setp");
    }
}

    }
}
