package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameSeries = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationRest = Integer.parseInt(scanner.nextLine());

        double timeLunch = durationRest * 1.0 / 8;
        double timeRelax = durationRest * 1.0 / 4;
        double freeTime = durationRest - (timeLunch + timeRelax);
        double differenceTime = Math.ceil((Math.abs(freeTime - durationEpisode)));

        if (freeTime >= durationEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSeries, differenceTime);
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSeries, differenceTime);
        }
    }
}