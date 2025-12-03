package session1Activity1_01;

import java.util.Scanner;
public class M1A4 {
            
            public static void main (String[]args) {
                        Scanner input = new Scanner(System.in);
                        
                        System.out.print("Enter your age: "); 
                        int intAge = input.nextInt();

                        if (intAge < 17) {
                                    System.out.println("Minor");                                    
                        } else if (intAge >= 18 && intAge <= 59 ) {
                                    System.out.println("Adult");
                        } else if (intAge >= 60 ) {
                                    System.out.println("Senior");
                        }
                        
                        input.close();
            }
}

