package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine();
        String grade = scanner.nextLine();
        double totalPrice = 0;

        switch (place){
            case "room for one person":
                totalPrice = (days - 1) * 18;
                break;

            case "apartment":
                totalPrice = (days - 1) * 25;
                if (days - 1 < 10){
                    totalPrice = totalPrice - (totalPrice * 0.3);
                }else if (days - 1 >= 10 && days - 1 <= 15){
                    totalPrice = totalPrice - (totalPrice * 0.35);
                }else {
                    totalPrice = totalPrice - (totalPrice * 0.50);
                }
                break;

            case "president apartment":
                totalPrice = (days - 1) * 35;
                if (days - 1 < 10){
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }else if (days - 1 >= 10 && days - 1 <= 15){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }else {
                    totalPrice = totalPrice - (totalPrice * 0.20);
                }
                break;
        }

        if (grade.equals("positive")){
            totalPrice = totalPrice + (totalPrice * 0.25);

        }else if (grade.equals("negative")){
            totalPrice = totalPrice - (totalPrice * 0.1);
        }

        System.out.printf("%.2f", totalPrice);
    }
}