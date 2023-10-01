package ConditionalStatementsAdvanced_Exercise3;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spent = 0;
        String destination = "";
        String placeForSleep = "";

        switch (season){
            case "summer":
                if (budget <= 100){
                    destination = "Bulgaria";
                    spent = budget * 0.3;
                }else if (budget > 100 && budget <= 1000){
                    destination = "Balkans";
                    spent = budget * 0.4;
                }else {
                    destination = "Europe";
                    spent = budget * 0.9;
                }
                break;

            case "winter":
                if (budget <= 100){
                    destination = "Bulgaria";
                    spent = budget * 0.7;
                }else if (budget > 100 && budget <= 1000){
                    destination = "Balkans";
                    spent = budget * 0.8;
                }else {
                    destination = "Europe";
                    spent = budget * 0.9;
                }
                break;
        }

        if (destination.equals("Europe")){
            placeForSleep = "Hotel";
        }else if (season.equals("summer")){
            placeForSleep = "Camp";
        }else if (season.equals("winter")){
            placeForSleep = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", placeForSleep, spent);
    }
}
