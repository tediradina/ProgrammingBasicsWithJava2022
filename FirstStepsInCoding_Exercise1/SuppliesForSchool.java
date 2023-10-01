package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        int litersCleaner = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double neededMoneyWithoutDiscount = (countPens * 5.8) + (countMarkers * 7.2) + (litersCleaner * 1.2);
        double neededMoney = neededMoneyWithoutDiscount - ((neededMoneyWithoutDiscount * percentDiscount) / 100);

        System.out.println(neededMoney);
    }
}
