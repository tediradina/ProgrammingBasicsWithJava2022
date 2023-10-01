package NestedLoops_LAB6;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        int numberOfRooms = Integer.parseInt(scanner.nextLine());

        for (int i = numberOfFloors; i >= 1; i--){
            for (int j = 0; j < numberOfRooms; j++){
                if (i == numberOfFloors){
                    System.out.printf("L%d%d ", i, j);
                }else if (i % 2 == 0){
                    System.out.printf("O%d%d ", i, j);
                }else {
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println("");
        }
    }
}
