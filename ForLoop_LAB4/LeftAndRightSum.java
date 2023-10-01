package ForLoop_LAB4;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countRepeat = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= countRepeat; i++){
            int leftNumber = Integer.parseInt(scanner.nextLine());
            leftSum = leftSum + leftNumber;
        }
        for (int i = 1; i <= countRepeat; i++){
            int rightNumber = Integer.parseInt(scanner.nextLine());
            rightSum = rightSum + rightNumber;
        }

        if (rightSum == leftSum){
            System.out.printf("Yes, sum = %d", rightSum);
        }else{
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
