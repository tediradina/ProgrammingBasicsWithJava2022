package ForLoop_Exercise4;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int numberOfAssessors = Integer.parseInt(scanner.nextLine());

        double totalPoints = pointsAcademy;

        for (int i = 1; i <= numberOfAssessors; i++){
            double getPointsAssessors = 0;
            String nameAssessors = scanner.nextLine();
            double pointsAssessors = Double.parseDouble(scanner.nextLine());
            getPointsAssessors = (nameAssessors.length() * pointsAssessors) / 2;
            totalPoints = totalPoints + getPointsAssessors;

            if (totalPoints > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPoints);
                return;
            }
        }
        double neededPoints = Math.abs(totalPoints - 1250.5);
        System.out.printf("Sorry, %s you need %.1f more!", nameActor,neededPoints);
    }
}
