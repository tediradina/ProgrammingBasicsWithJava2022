package ConditionalStatementsAdvanced_Lab3;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double percentage = 0;
        boolean flag = false;

        switch (town){
            case "Sofia":
                if (sales >= 0 && sales <= 500){
                    percentage = 5;
                }else if (sales > 500 && sales <= 1000){
                    percentage = 7;
                }else if (sales > 1000 && sales <= 10000){
                    percentage = 8;
                }else if (sales > 10000){
                    percentage = 12;
                }
                break;

            case "Varna":
                if (sales >= 0 && sales <= 500){
                    percentage = 4.5;
                }else if (sales > 500 && sales <= 1000){
                    percentage = 7.5;
                }else if (sales > 1000 && sales <= 10000){
                    percentage = 10;
                }else if (sales > 10000){
                    percentage = 13;
                }
                break;

            case "Plovdiv":
                if (sales >= 0 && sales <= 500){
                    percentage = 5.5;
                }else if (sales > 500 && sales <= 1000){
                    percentage = 8;
                }else if (sales > 1000 && sales <= 10000){
                    percentage = 12;
                }else if (sales > 10000){
                    percentage = 14.5;
                }
                break;

            default:
                flag = true;
                break;
        }
        if (sales < 0 || flag){
            System.out.printf("error");
        }else {
            double commission = sales * (percentage / 100);
            System.out.printf("%.2f", commission);
        }
    }
}
