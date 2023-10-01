package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bgn = Double.parseDouble(scanner.nextLine());
        double usd = bgn * 1.79549;

        System.out.println(usd);
    }
}
