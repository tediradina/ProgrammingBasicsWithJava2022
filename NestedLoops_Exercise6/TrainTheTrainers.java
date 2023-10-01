package NestedLoops_Exercise6;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double averageSum = 0;
        int countPresentation = 0;

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            countPresentation++;
            double totalSumGrade = 0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalSumGrade = totalSumGrade + grade;

            }
            double averageGrade = totalSumGrade / n;
            System.out.printf("%s - %.2f.%n", input, averageGrade);
            averageSum = averageSum + averageGrade;

            input = scanner.nextLine();
        }

        averageSum = averageSum / countPresentation;
        System.out.printf("Student's final assessment is %.2f.%n", averageSum);
    }
}
