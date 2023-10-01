package ForLoop_Exercise4;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int countToys = 0;
        int saveMoney = 0;
        double totalSaveMoney = 0;
        int brotherMoney = 0;

        for (int i = 1; i <= age; i++){
            if (i % 2 == 0){
                //Така добавяме за всяка четна година 10 лв. и изваждаме по 1 лв., който взима брат й.
                saveMoney = saveMoney + 10;
                brotherMoney++;
                totalSaveMoney = totalSaveMoney + saveMoney;

            }else {
                countToys++;
            }
        }
        double moneyFromTheToys = countToys * toyPrice;
        totalSaveMoney = totalSaveMoney + moneyFromTheToys - brotherMoney;

        double diff = Math.abs(totalSaveMoney - priceWashingMachine);

        if (totalSaveMoney >= priceWashingMachine){
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
