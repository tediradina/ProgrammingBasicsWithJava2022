package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChicken = Integer.parseInt(scanner.nextLine());
        int menuFish = Integer.parseInt(scanner.nextLine());
        int menuVegetarian = Integer.parseInt(scanner.nextLine());

        double billWithoutDesert = menuChicken * 10.35 + menuFish * 12.4 + menuVegetarian * 8.15;
        double billDesert = billWithoutDesert * 0.2;

        double totalBill = billDesert + billWithoutDesert + 2.5;

        System.out.println(totalBill);
    }
}
