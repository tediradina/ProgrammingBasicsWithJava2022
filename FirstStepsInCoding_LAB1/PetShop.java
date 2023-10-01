package FirstStepsInCoding_LAB1;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFoodForDogs = Integer.parseInt(scanner.nextLine());
        int countFoodForCats = Integer.parseInt(scanner.nextLine());

        double totalBill = (countFoodForCats * 4) + (countFoodForDogs * 2.5);
        System.out.printf("%.1f lv.", totalBill);
    }
}
