import java.util.Scanner;

public class IT24103660Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_RATE = 48000;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < MIN_DAY || startDate > MAX_DAY || endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int daysReserved = endDate - startDate;
        double discount = 0;
[
        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = 0.10;
        } else if (daysReserved >= 5) {
            discount = 0.20;
        }

        double totalAmount = daysReserved * ROOM_RATE * (1 - discount);

        System.out.println("Days Reserved: " + daysReserved);
        System.out.println("Total Amount: Rs " + totalAmount);

        scanner.close();
    }
}
