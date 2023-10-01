package WhileLoop_LAB5;

import java.util.Scanner;

public class Sequence2k_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 1;

        while (sum <= numbers){
            System.out.println(sum);
            sum = sum * 2 + 1;
        }

        //for (int i = 1; i <= numbers; i = i * 2 + 1){
        //                System.out.println(i);
        //            }
    }
}
