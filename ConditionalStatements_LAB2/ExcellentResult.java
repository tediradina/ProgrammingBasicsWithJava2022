package ConditionalStatements_LAB2;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());
        if (grade >= 5 && grade <= 6){
            System.out.println("Excellent!");
        }else {

        }
    }
}
