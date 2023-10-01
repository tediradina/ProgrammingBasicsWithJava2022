package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeProjection = scanner.nextLine();
        int countRows = Integer.parseInt(scanner.nextLine());
        int countColumns = Integer.parseInt(scanner.nextLine());

        int places = countColumns * countRows;
        double price = 0;

        switch (typeProjection){
            case "Premiere":
                price = 12;
                break;

            case "Normal":
                price = 7.5;
                break;

            case "Discount":
                price = 5;
                break;
        }

        double totalPrice = price * places;
        System.out.printf("%.2f leva", totalPrice);
    }
}