package FirstStepsInCoding_Exercise1;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesBook = Integer.parseInt(scanner.nextLine());
        int readPages = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        int timeNeeded = pagesBook / readPages ;
        int readPagesDay = timeNeeded / countDays;

        System.out.println(readPagesDay);

    }
}
