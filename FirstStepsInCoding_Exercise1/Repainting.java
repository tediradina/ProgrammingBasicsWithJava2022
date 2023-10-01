package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double moneyForNylon = (nylon + 2) * 1.5;
        double moneyForPaint = (paint + (paint * 0.1)) * 14.5;
        double sumMaterial = 0.4 + moneyForNylon + moneyForPaint + (thinner * 5);
        double moneyForForeman = sumMaterial * 0.3;

        double totalSum = sumMaterial + (moneyForForeman * hours);

        System.out.println(totalSum);
    }
}
