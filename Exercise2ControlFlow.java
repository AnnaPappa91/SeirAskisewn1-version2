/*
 The following program calculated what month is according to season
 */
package exercise2controlflow;

import java.util.Scanner;


public class Exercise2ControlFlow {

    public static void main(String[] args) {
        String month;
        String season;
        Scanner input= new Scanner(System.in);
        System.out.println("Select a month: ");
        month=input.next();
        switch (month){
            case "March": case "April": case"May":
                 season="Spring";
                 System.out.println(season);
                 break;
            case "June": case "July": case "August":
                 season="Summer";
                 System.out.println(season);
                 break;
            case "September":case "October": case "November":
                 season="Autumn";
                 System.out.println(season);
                 break;
            case "December":case "January":case "February":
                 season="brrrr...Winter";
                 System.out.println(season);
                 break;
            default:
                 System.out.println("invalid input");
         
                        
        }
        
        
    }
    
}
