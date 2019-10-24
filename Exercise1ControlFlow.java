/*
 *
 */
package exercise1controlflow;

import java.util.Scanner;


public class Exercise1ControlFlow {
    

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age");
        double age=input.nextDouble();
        if(age>=6&&age<=12){
            System.out.println("Πηγαίνεις στο δημοτικό");
        }
        else if(age>12&&age<18){
            System.out.println("Πηγαίνεις στο γυμνάσιο ή στο λύκειο");
        }
        else if(age>=18&&age<=22){
            System.out.println("Πηγαίνεις στο πανεπιστήμιο(4 χρόνια φήτησης)");
        }
        else{
            System.out.println("Ή είσαι άνεργος ή δουλεύεις ή έχεις βγεί στην σύνταξη");
        }
        
    }
    
}
