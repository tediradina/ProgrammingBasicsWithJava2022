package FirstStepsInCoding_LAB1;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.printf("Hello, %s!", name);

    }
}
