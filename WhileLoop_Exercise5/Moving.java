package WhileLoop_Exercise5;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String numberOfCartons = scanner.nextLine();
        int freeSpace = width * length * height;

        while (!numberOfCartons.equals("Done")){
            int countCartons = Integer.parseInt(numberOfCartons);
            freeSpace = freeSpace - countCartons;
            if (freeSpace < 0){
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
                return;
            }
            numberOfCartons = scanner.nextLine();
        }
            System.out.printf("%d Cubic meters left.", freeSpace);


    }
}
