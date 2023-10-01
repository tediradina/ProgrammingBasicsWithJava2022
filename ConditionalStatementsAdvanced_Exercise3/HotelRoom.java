package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int countOvernightStay = Integer.parseInt(scanner.nextLine());
        double priceForStudio = 0;
        double priceForApartament = 0;
        double discount = 0;

        switch (month){
            case "May":
            case "October":
                priceForStudio = 50 * countOvernightStay;
                priceForApartament = 65 * countOvernightStay;
                if (countOvernightStay > 7 && countOvernightStay <= 14){
                    priceForStudio = priceForStudio - (priceForStudio * 0.05);
                }else if (countOvernightStay > 14){
                    priceForStudio = priceForStudio - (priceForStudio * 0.3);
                }
                break;

            case "June":
            case "September":
                priceForStudio = 75.2 * countOvernightStay;
                priceForApartament = 68.7 * countOvernightStay;
                if (countOvernightStay > 14){
                    priceForStudio = priceForStudio - (priceForStudio * 0.2);
                }
                break;

            case "July":
            case "August":
                priceForStudio = 76 * countOvernightStay;
                priceForApartament = 77 * countOvernightStay;
                break;
        }

        if (countOvernightStay > 14){
            priceForApartament = priceForApartament - (priceForApartament * 0.1);
        }

        System.out.printf("Apartment: %.2f lv.%n", priceForApartament);
        System.out.printf("Studio: %.2f lv.", priceForStudio);

    }
}
