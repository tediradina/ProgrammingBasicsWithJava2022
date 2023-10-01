package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class TimeAdd15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int sumMin = hour * 60 + min + 15;
        int newHour = sumMin / 60;
        int newMin = sumMin % 60;

        if (newHour == 24){
            newHour = 0;
        }
        System.out.printf("%d:%02d", newHour, newMin);

    }
}
