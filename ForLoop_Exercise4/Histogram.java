package ForLoop_Exercise4;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= countNumbers; i++){
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200){
                p1++;
            }else if (number >= 200 && number <= 399){
                p2++;
            }else  if (number >= 400 && number <= 599){
                p3++;
            }else if (number >= 600 && number <= 799){
                p4++;
            }else {
                p5++;
            }
        }

        //Изчисляваме какъв процент от числата попадат в следните диапазони
        double p1Percent = p1 * 1.0 / countNumbers * 100;
        double p2Percent = p2 * 1.0 / countNumbers * 100;
        double p3Percent = p3 * 1.0 / countNumbers * 100;
        double p4Percent = p4 * 1.0 / countNumbers * 100;
        double p5Percent = p5 * 1.0 / countNumbers * 100;

        System.out.printf("%.2f%% %n", p1Percent);
        System.out.printf("%.2f%% %n", p2Percent);
        System.out.printf("%.2f%% %n", p3Percent);
        System.out.printf("%.2f%% %n", p4Percent);
        System.out.printf("%.2f%% %n", p5Percent);
    }
}
