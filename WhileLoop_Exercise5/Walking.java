package WhileLoop_Exercise5;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 10000;

        String input = scanner.nextLine();
        while (!input.equals("Going home")){
            target = target - Integer.parseInt(input);
            if (target <= 0){
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!%n", Math.abs(target));
                return;
            }
            input = scanner.nextLine();
        }

        int goHomeSteps = Integer.parseInt(scanner.nextLine());
        target = target - goHomeSteps;
        if (target <= 0){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", Math.abs(target));
        }else {
            System.out.printf("%d more steps to reach goal.%n", Math.abs(target));
        }
    }
}
