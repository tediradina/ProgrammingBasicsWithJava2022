package WhileLoop_Exercise5;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFallGrade = Integer.parseInt(scanner.nextLine());
        int countFall = 0;
        int countExercises = 0;
        double sumGrades = 0;
        String lastExerciseName = "";


        String nameExercise = scanner.nextLine();
        while (!nameExercise.equals("Enough")){
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades = sumGrades + grade;
            countExercises++;
            if (grade <= 4){
                countFall++;
                if (countFall >= countFallGrade){
                    System.out.printf("You need a break, %d poor grades.%n", countFall);
                    return;
                }
            }
            lastExerciseName = nameExercise;
            nameExercise = scanner.nextLine();
        }

        double averageGrade = sumGrades / countExercises;
        System.out.printf("Average score: %.2f%n", averageGrade);
        System.out.printf("Number of problems: %d%n", countExercises);
        System.out.printf("Last problem: %s%n", lastExerciseName);
    }
}
