package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        //превръщам от кубични сантиметри в кубични дециметри като деля на 1000
        double area = (length * width * height) / 1000.0;

        double water = area * (1 - (percentage / 100));

        System.out.println(water);



    }
}
