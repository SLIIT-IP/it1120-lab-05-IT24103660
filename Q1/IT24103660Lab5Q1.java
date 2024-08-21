import java.util.Scanner;

public class IT24103660Lab5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int number1 = sc.nextInt();
        
        System.out.println("Enter the second integer: ");
        int number2 = sc.nextInt();
        
        System.out.println("Enter the third integer: ");
        int number3 = sc.nextInt();
        
        // Find the largest and smallest number
        int largest = number1;
        int smallest = number1;

        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;
        
        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;
        
        System.out.println("User entered numbers are: " + number1 + " " + number2 + " " + number3);
        System.out.println("The Largest number is: " + largest);
        System.out.println("The Smallest number is: " + smallest);
    }
}
