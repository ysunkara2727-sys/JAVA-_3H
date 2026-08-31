import java.util.Scanner;
public class control {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println("\nFor loop: Printing numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("\nWhile loop: Counting down from 5");
        int count = 5;
        while (count > 0) {
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("\nDo-While loop: Executed at least once");
        int x = 0;
        do {
            System.out.println("x = " + x);
            x++;
        } while (x < 3);

        System.out.print("\nEnter a day number (1-3): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Day 1: Monday");
                break;
            case 2:
                System.out.println("Day 2: Tuesday");
                break;
            case 3:
                System.out.println("Day 3: Wednesday");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        scanner.close();
    }
}
