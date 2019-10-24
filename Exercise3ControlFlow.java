/*
 Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest).
 */
package exercise3controlflow;

import java.util.Scanner;


public class Exercise3ControlFlow {

    
    public static void main(String[] args) {
        char grade;
        String message;
        Scanner input= new Scanner(System.in);
        System.out.println("Give a grade:");
        grade=input.next().charAt(0);
        if (grade=='A'){
            message="Perfect";
            System.out.println(message);
        }
        else if(grade=='B'){
            message="Good";
            System.out.println(message);
        }
        else if(grade=='C'||grade=='D'){
            message="Pass";
            System.out.println(message);
        }
        else
            System.out.println("Fail");
            
    
    
                
        
    }
    
}
