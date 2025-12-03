package session1Activity1_01;

import java.util.Scanner;
public class M1A2 {
            public static void main (String[]args) {
                        Scanner input = new Scanner(System.in);
                        System.out.print("Enter your age: "); 
                        String ageStr = input.nextLine();
                        int ageInt = Integer.parseInt(ageStr);
                        double ageDbl = Double.parseDouble(ageStr);
                        System.out.println("Your age as int: " + ageInt ); 
                        System.out.println("Your age as double: " + ageDbl ); 
                        input.close();  
            }
}

