package ForLoop_Exercise4;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        double totalPoints = startPoints;
        int getPointsFromTournament = 0;
        int wins = 0;

        for (int i = 1; i <= numberOfTournaments; i++){
            String round = scanner.nextLine();

            switch (round){
                case "W":
                    wins++;
                    getPointsFromTournament = getPointsFromTournament + 2000;
                    break;

                case "F":
                    getPointsFromTournament = getPointsFromTournament + 1200;
                    break;

                case "SF":
                    getPointsFromTournament = getPointsFromTournament + 720;
                    break;

                default:
                    break;
            }
        }
        totalPoints = totalPoints + getPointsFromTournament;
        System.out.printf("Final points: %.0f%n", totalPoints);

        double averagePoints = Math.floor(getPointsFromTournament  * 1.0/ numberOfTournaments);
        System.out.printf("Average points: %.0f%n", averagePoints);

        double winPercentageTournaments = wins * 1.0 / numberOfTournaments * 100;
        System.out.printf("%.2f%%%n", winPercentageTournaments);
    }
}
