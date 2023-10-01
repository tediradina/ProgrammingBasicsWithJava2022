package WhileLoop_Exercise5;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width =  Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int piecesOfCake = width * length;

        String input = scanner.nextLine();
        while (!input.equals("STOP")){
            piecesOfCake = piecesOfCake - Integer.parseInt(input);
            if(piecesOfCake <= 0){
                System.out.printf("No more cake left! You need %d pieces more.%n", Math.abs(piecesOfCake));
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d pieces are left.%n", piecesOfCake);
    }
}
