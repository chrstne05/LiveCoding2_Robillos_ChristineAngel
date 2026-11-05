/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding2;
import java.util.Scanner;
/**
 *
 * @author ROBILLOS_CPE113
 */
public class LiveCoding2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    
    //PROB 1
        System.out.println();
        System.out.println("===== AVERAGE | EQUIVALENT | PASSING GRADE =====");
        System.out.println();
        System.out.println("-- Enter your exam scores --");
        System.out.print("Prelim: ");
        double prelim = input.nextDouble();
        System.out.print("Midterm: ");
        double midterm = input.nextDouble();
        System.out.print("Finals: ");
        double finals = input.nextDouble();
        
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Average: " + calculateAverage(prelim, midterm, finals));
        System.out.println("Equivalent: " + getGradeEquivalent (calculateAverage (prelim, midterm, finals)));
        System.out.println("Status: " + isPassed (calculateAverage (prelim, midterm, finals)));
        System.out.println("------------------------------");
        
    
    //PROB 2
        System.out.println();
        System.out.println("===== ELECTRICITY CALCULATOR =====");
        System.out.println();
        System.out.print("Enter your electricy consumption: ");
        double charge = input.nextDouble();
        double rate;
        System.out.print("Enter rate %: ");
        double percent = input.nextDouble();
        
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Consumption Charge: " + calculateConsumptionCharge(charge, percent));
        System.out.println("Additional Charge (5%): " + calculateAdditionalCharge (calculateConsumptionCharge(charge, percent),5));
        System.out.println("Total Bill: "  + calculateTotalBill(calculateConsumptionCharge(charge, percent), calculateAdditionalCharge (calculateConsumptionCharge(charge, percent),5)));
        System.out.println("------------------------------");






    
    //---  void ---
    }
   //prob 1
    static double calculateAverage(double prelim, double midterm, double finals){
        return (prelim + midterm + finals) / 3;  
    }
    static char getGradeEquivalent (double average){
        char ave;
        if (average >= 90){
        ave = 'A';
        } else if (average >= 85){
        ave = 'B';
        } else if (average >= 80){
        ave = 'C';
        } else if (average >= 75){
        ave = 'D';
        } else {
        ave = 'F';
        }
        return ave;
    }
    static boolean isPassed (double average){
        if (average >= 75){
            return true;
        } else {
            return false;  
        }       
    }
    //prob 2
    static double calculateConsumptionCharge(double charge, double rate){
        return charge * rate;
    }
    static double calculateAdditionalCharge(double consumpCharge, double percent){
        return consumpCharge * (percent/100);
    }
    static double calculateTotalBill(double consumptionCharge, double additionalCharge){
        return additionalCharge + consumptionCharge;
    }
}
