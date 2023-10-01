package NestedLoops_Exercise6;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++){
            int evenSum = 0;
            int oddSum = 0;
            int number = i;
            for (int j = 6; j >= 1; j--){
                int ostatuk = number % 10;
                number = number / 10;
                if (j % 2 == 0){
                    evenSum = evenSum + ostatuk;
                }else {
                    oddSum = oddSum + ostatuk;
                }
            }
            if (oddSum == evenSum){
                System.out.print(i + " ");
            }
        }

// *************** ВТОРО РЕШЕНИЕ ********************************
//        int firstNumber = Integer.parseInt(scanner.nextLine());
//        int secondNumber = Integer.parseInt(scanner.nextLine());
//
//        for (int i = firstNumber; i <= secondNumber; i++){
//            int oddSum = 0;
//            int evenSum = 0;
//
//            String currentNum = "" + i;
//            for (int j = 0; j < currentNum.length(); j++){
//                int num = Integer.parseInt("" + currentNum.charAt(j));
//                if (j % 2 == 0){
//                    evenSum = evenSum + num;
//                }else {
//                    oddSum = oddSum + num;
//                }
//            }
//            if (oddSum == evenSum){
//                System.out.print(i + " ");
//            }
//        }
    }
}
