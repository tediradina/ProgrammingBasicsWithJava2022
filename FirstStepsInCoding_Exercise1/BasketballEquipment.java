package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taksa = Double.parseDouble(scanner.nextLine());

        double trainers = taksa - (taksa * 0.4);
        double ekip = trainers - (trainers * 0.2);
        double ball = ekip / 4;
        double accessories = ball / 5;

        double totalSum = taksa + trainers + ekip + ball + accessories;
        System.out.println(totalSum);
    }
}
