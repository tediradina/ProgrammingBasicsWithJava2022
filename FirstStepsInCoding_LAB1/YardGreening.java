package FirstStepsInCoding_LAB1;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());

        double totalSum = meters * 7.61;
        double discount = (totalSum * 18) / 100;
        double finalPrice = totalSum - discount;

        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);

    }
}
