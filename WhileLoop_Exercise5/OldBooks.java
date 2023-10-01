package WhileLoop_Exercise5;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favouriteBook = scanner.nextLine();
        String titleOfBook = scanner.nextLine();
        int checkedBooks = 0;

        while (!titleOfBook.equals("No More Books")){
            if (titleOfBook.equals(favouriteBook)){
                System.out.printf("You checked %d books and found it.", checkedBooks);
                return;
            }
            checkedBooks++;
            titleOfBook = scanner.nextLine();
        }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", checkedBooks);
    }
}
