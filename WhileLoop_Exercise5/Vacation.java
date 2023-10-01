package WhileLoop_Exercise5;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double saveMoney = Double.parseDouble(scanner.nextLine());
        int daySpend = 0;
        int pastDays = 0;

        String input = scanner.nextLine();
        while (input.equals("spend") || input.equals("save")){
            double saveOrSpendMoney = Double.parseDouble(scanner.nextLine());

            pastDays++;
            if (input.equals("spend")){
                daySpend++;
                saveMoney = saveMoney - saveOrSpendMoney;
                if (saveMoney < 0){
                    saveMoney = 0;
                }
            }else if (input.equals("save")){
                saveMoney = saveMoney + saveOrSpendMoney;
                daySpend = 0;
            }

            if (daySpend >= 5){
                System.out.println("You can't save the money.");
                System.out.printf("%d%n", pastDays);
                return;
            }

            if (neededMoney <= saveMoney){
                System.out.printf("You saved the money for %d days.", pastDays);
                return;
            }
            input = scanner.nextLine();
        }
    }
}
