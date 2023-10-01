package ConditionalStatements_Exercise2;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int totalTime = firstTime + secondTime + thirdTime;
        int min = totalTime / 60;
        int second = totalTime % 60;
        // с шаблон, който добавя нула на секундите, ако са под 10
        //System.out.printf("%d:%02d", min, second);

        // може и по този начин да се реши:
        if (second < 10){
            System.out.printf("%d:0%d", min, second);
        }else{
            System.out.printf("%d:%d", min, second);
        }
    }
}
