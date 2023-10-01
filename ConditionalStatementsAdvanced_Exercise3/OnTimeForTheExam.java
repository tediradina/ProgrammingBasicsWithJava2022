package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int examTime = hourExam * 60 + minutesExam;
        int arrivalTime = hourArrival * 60 + minutesArrival;
        int difference = 0;

        if (examTime - arrivalTime <= 30 && examTime - arrivalTime >= 0){
            System.out.printf("On time%n");
        } else if (examTime - arrivalTime < 0){
            System.out.printf("Late%n");
        }else {
            System.out.printf("Early%n");
        }

        if (examTime - arrivalTime == 0){

        }else {
            if (examTime > arrivalTime){
                difference = Math.abs(examTime - arrivalTime);
                if (difference >= 60){
                    int hour = difference / 60;
                    int min = difference % 60;
                    System.out.printf("%d:%02d hours before the start%n", hour, min);
                }else {
                    System.out.printf("%d minutes before the start%n", difference);
                }
            }else if (examTime < arrivalTime){
                difference = Math.abs(examTime - arrivalTime);
                if (difference >= 60){
                    int hour = difference / 60;
                    int min = difference % 60;
                    System.out.printf("%d:%02d hours after the start%n", hour, min);
                }else {
                    System.out.printf("%d minutes after the start%n", difference);
                }
            }
        }
    }
}
