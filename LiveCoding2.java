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
        Scanner input = new Scanner(System.in);

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
        System.out.println("Equivalent: " + getGradeEquivalent(calculateAverage(prelim, midterm, finals)));
        System.out.println("Status: " + isPassed(calculateAverage(prelim, midterm, finals)));
        System.out.println("------------------------------");

        //PROB 2
        System.out.println();
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
        System.out.println("Additional Charge (5%): " + calculateAdditionalCharge(calculateConsumptionCharge(charge, percent), 5));
        System.out.println("Total Bill: " + calculateTotalBill(calculateConsumptionCharge(charge, percent), calculateAdditionalCharge(calculateConsumptionCharge(charge, percent), 5)));
        System.out.println("------------------------------");

        //PROB 3
        System.out.println();
        System.out.println();
        System.out.println("===== ARRAY STATISTICS ANALYZER =====");
        System.out.print("Enter the count of students: ");
        int count = input.nextInt();
        if (count <= 0) {
            System.out.println("Error: Number of students must be greater than 0.");
        }
        System.out.println();
        int[] scores = new int[count];

        for (int i = 0; i < scores.length; i++) {
            
            System.out.print("Enter score of student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        int sum = calculateSum(scores);

        double arrayAverage = calculateAverage(scores);

        int highest = findHighest(scores);

        int lowest = findLowest(scores);

        int passing = countPassing(scores);

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Total Number of Scores: " + scores.length);
        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + arrayAverage);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Number of Passing Students: " + passing);
        System.out.println("------------------------------");


        //---  void ---
    }
    //prob 1
    static double calculateAverage(double prelim, double midterm, double finals) {
        return (prelim + midterm + finals) / 3;
    }

    static char getGradeEquivalent(double average) {
        char ave;
        if (average >= 90) {
            ave = 'A';
        } else if (average >= 85) {
            ave = 'B';
        } else if (average >= 80) {
            ave = 'C';
        } else if (average >= 75) {
            ave = 'D';
        } else {
            ave = 'F';
        }
        return ave;
    }

    static boolean isPassed(double average) {
        if (average >= 75) {
            return true;
        } else {
            return false;
        }
    }

    //prob 2
    static double calculateConsumptionCharge(double charge, double rate) {
        return charge * rate;
    }

    static double calculateAdditionalCharge(double consumpCharge, double percent) {
        return consumpCharge * (percent / 100);
    }

    static double calculateTotalBill(double consumptionCharge, double additionalCharge) {
        return additionalCharge + consumptionCharge;
    }

    //prob3
    static int calculateSum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    static double calculateAverage(int[] scores) {
        int sum = calculateSum(scores);
        return (double) sum / scores.length;
    }

    static int findHighest(int[] scores) {
        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }
        return highest;
    }

    static int findLowest(int[] scores) {
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        return lowest;
    }
    static int countPassing(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 75) {
                count++;
            }
        }
        return count;
    }
}
