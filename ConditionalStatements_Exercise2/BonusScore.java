package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        //бонус според размера на точките
        if (score <= 100){
           bonus = bonus + 5;
        }else if (score > 100 && score <= 1000){
            bonus = bonus + (score * 0.2);
        }else if (score > 1000){
            bonus = bonus + (score * 0.1);
        }

        //бонус според това дали числото е четно и дали завършва на 5
        if (score % 2 == 0){
            bonus = bonus + 1;
        }
        if (score % 10 == 5){
            bonus = bonus + 2;
        }

        double totalScore = score + bonus;
        System.out.printf("%.1f%n", bonus);
        System.out.printf("%.1f%n", totalScore);
    }
}
