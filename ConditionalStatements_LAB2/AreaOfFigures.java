package ConditionalStatements_LAB2;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String type = scanner.nextLine();

            double result = 0;
            switch (type){
                case "square":
                    double a = Double.parseDouble(scanner.nextLine());
                    result = a * a;
                    break;

                case "rectangle":
                    a = Double.parseDouble(scanner.nextLine());
                    double b = Double.parseDouble(scanner.nextLine());
                    result = a * b;
                    break;

                case "circle":
                    double radius = Double.parseDouble(scanner.nextLine());
                    result = Math.PI * Math.pow(radius, 2);
                    break;

                case "triangle":
                    double c = Double.parseDouble(scanner.nextLine());
                    double hc = Double.parseDouble(scanner.nextLine());
                    result = c * hc / 2;
                    break;
            }
        System.out.printf("%.3f", result);
    }
}
