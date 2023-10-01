package ForLoop_Exercise4;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroup = Integer.parseInt(scanner.nextLine());

        int musalaPerson = 0;
        int monblanPerson = 0;
        int kilimanjaroPerson = 0;
        int k2Person = 0;
        int everestPerson = 0;
        int totalPeople = 0;

        for (int i = 1; i <= countGroup; i++){
            int personGroup = Integer.parseInt(scanner.nextLine());
            if (personGroup <= 5){
                musalaPerson = musalaPerson + personGroup;
            }else if(personGroup >= 6 && personGroup <= 12){
                monblanPerson = monblanPerson + personGroup;
            }else if (personGroup >= 13 && personGroup <= 25){
                kilimanjaroPerson = kilimanjaroPerson + personGroup;
            }else if (personGroup >= 26 && personGroup <= 40){
                k2Person = k2Person + personGroup;
            }else {
                everestPerson = everestPerson + personGroup;
            }
            totalPeople = totalPeople + personGroup;
        }

        double musalaPersonPercent = musalaPerson * 1.0 / totalPeople * 100;
        double monblanPersonPercent = monblanPerson * 1.0 / totalPeople * 100;
        double kilimanjaroPersonPercent = kilimanjaroPerson * 1.0 / totalPeople * 100;
        double k2PersonPercent = k2Person * 1.0 / totalPeople * 100;
        double everestPersonPercent = everestPerson * 1.0 / totalPeople * 100;

        System.out.printf("%.2f%%%n", musalaPersonPercent);
        System.out.printf("%.2f%%%n", monblanPersonPercent);
        System.out.printf("%.2f%%%n", kilimanjaroPersonPercent);
        System.out.printf("%.2f%%%n", k2PersonPercent);
        System.out.printf("%.2f%%%n", everestPersonPercent);
    }
}
