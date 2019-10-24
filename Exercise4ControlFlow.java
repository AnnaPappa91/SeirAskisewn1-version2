/*
 Program should ask your weight and planet. Compute your weight on the planet based on the table
 */
package exercise4controlflow;

import java.util.Scanner;


public class Exercise4ControlFlow {

    public static void main(String[] args) {
        String planet;
        double weight;
        double varos;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight: ");
        weight=input.nextDouble();
        System.out.println("Planets in our solar system:Venus,Mars,Jupiter,Saturn,Uranus,Neptune");
        System.out.println("Select a planet:");
        planet=input.next();
        switch (planet){
            case "Venus":
                varos=0.78*weight;
                System.out.println("Your wight in Venus is: "+ varos);
                break;
            case "Mars":
                varos=0.39*weight;
                System.out.println("Your wight in Mars is: "+ varos);
                break;
            case "Jupiter":
                varos=2.65*weight;
                System.out.println("Your wight in Jupiter is: "+ varos);
                break;
            case "Saturn":
                varos=1.17*weight;
                System.out.println("Your wight in Saturn is: "+ varos);
                break;
            case "Uranus":
                varos=1.05*weight;
                System.out.println("Your wight in Uranus is: "+ varos);
                break;
            case "Neptune":
                varos=1.23*weight;
                System.out.println("Your wight in Venus is: "+ varos);
                break;
            default:
                System.out.println("no more planets!!!");
                
        }
        
        
        
    }
    
}
