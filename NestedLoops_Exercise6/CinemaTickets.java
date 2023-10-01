package NestedLoops_Exercise6;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalTickets = 0;

        double studentTickets = 0;
        double standardTickets = 0;
        double kidTickets = 0;
        String nameOfFilm = scanner.nextLine();
        while (!nameOfFilm.equals("Finish")){
            int countTickets = 0;
            int freeSpaces = Integer.parseInt(scanner.nextLine());
            String typeOfTickets = scanner.nextLine();
            while (!typeOfTickets.equals("End")){
                countTickets++;

                if (typeOfTickets.equals("student")){
                    studentTickets++;
                }else if (typeOfTickets.equals("standard")){
                    standardTickets++;
                }else if (typeOfTickets.equals("kid")){
                    kidTickets++;
                }

                if (countTickets == freeSpaces){
                    break;
                }
                typeOfTickets = scanner.nextLine();
            }
            totalTickets = totalTickets + countTickets;

            double percentageOfHallFilled = countTickets * 1.0 / freeSpaces * 100;
            System.out.printf("%s - %.2f%% full.%n", nameOfFilm, percentageOfHallFilled);

            nameOfFilm = scanner.nextLine();
        }

        System.out.printf("Total tickets: %.0f%n", totalTickets);
        studentTickets = studentTickets / totalTickets * 100;
        standardTickets = standardTickets / totalTickets * 100;
        kidTickets = kidTickets / totalTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", studentTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidTickets);
    }
}
