package WhileLoop_LAB5;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double gradeSum = 0;
        int countFall = 0;
        for (int i = 1; i <= 12; i++){
            double grade = Double.parseDouble(scanner.nextLine());
            while (grade < 4){
                countFall++;
                if (countFall > 1){
                    System.out.printf("%s has been excluded at %d grade", name, i);
                    return;
                }
                grade = Double.parseDouble(scanner.nextLine());
            }
            gradeSum = gradeSum + grade;
        }
        double averageGrade = gradeSum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade );
    }
}
