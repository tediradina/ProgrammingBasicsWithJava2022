package NestedLoops_Exercise6;
import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int ostatuk = i;
            int ostatukModul = i;
            boolean flag = false;

            for (int j = 1; j <= 4; j++) {
                ostatukModul = ostatuk % 10;
                ostatuk = ostatuk / 10;

                if (ostatukModul == 0 || n % ostatukModul != 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.print(i + " ");
            }
        }
    }
}
