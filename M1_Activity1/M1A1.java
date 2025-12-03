package session1Activity1_01;

import java.util.Scanner;
public class M1A1 {
            public static void main (String[]args) {
                        Scanner input = new Scanner(System.in);
                        System.out.print("What is your name? "); 
                        String name = input.nextLine();
                        System.out.println("Hello, " + name + "!");
                        input.close(); 
            }
}

