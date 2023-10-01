package ForLoop_Exercise4;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int openTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= openTabs; i++){
            String siteName = scanner.nextLine();

            switch (siteName){
                case "Facebook":
                    salary = salary - 150;
                    break;

                case "Instagram":
                    salary = salary - 100;
                    break;

                case "Reddit":
                    salary = salary - 50;
                    break;

                default:
                    break;
            }
            if (salary <= 0){
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.printf("%.0f", salary);

    }
}
