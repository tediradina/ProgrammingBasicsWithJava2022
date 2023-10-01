package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVacation = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDolls = Integer.parseInt(scanner.nextLine());
        int countTeddyBears = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double totalMoney = countPuzzles * 2.6 + countDolls * 3 + countTeddyBears * 4.1 + countMinions * 8.2 + countTrucks * 2;
        double totalCountToys = countDolls + countPuzzles + countTeddyBears + countMinions + countTrucks;
        if (totalCountToys >= 50){
            totalMoney = totalMoney - (totalMoney * 0.25);
        }
        //изваждам парите за наема
        totalMoney = totalMoney - (totalMoney * 0.1);

        double difference = Math.abs(totalMoney - priceVacation);

        if (totalMoney >= priceVacation){
            System.out.printf("Yes! %.2f lv left.", difference);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}
