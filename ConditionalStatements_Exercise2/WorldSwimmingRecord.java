package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeter = Double.parseDouble(scanner.nextLine());
        double timeSwimming1Meter = Double.parseDouble(scanner.nextLine());

        double delayTime = (Math.floor(distanceMeter / 15)) * 12.5;
        double neededTime = delayTime + (timeSwimming1Meter * distanceMeter);
        double difference = neededTime - recordSeconds;

        if (neededTime < recordSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", neededTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
