package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;
        switch (flower){
            case "Roses":
                price = 5;
                totalPrice = price * countFlowers;
                if (countFlowers > 80){
                    totalPrice = totalPrice - (totalPrice * 0.1);
                }
                break;

            case "Dahlias":
                price = 3.8;
                totalPrice = price * countFlowers;
                if (countFlowers > 90 ){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;

            case "Tulips":
                price = 2.8;
                totalPrice = price * countFlowers;
                if (countFlowers > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;

            case "Narcissus":
                price = 3;
                totalPrice = price * countFlowers;
                if (countFlowers < 120){
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;

            case "Gladiolus":
                price = 2.5;
                totalPrice = price * countFlowers;
                if (countFlowers < 80){
                    totalPrice = totalPrice + (totalPrice * 0.2);
                }
                break;
        }
        double difference = Math.abs(budget - totalPrice);
        if (budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, difference);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
