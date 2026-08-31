import java.util.Scanner;
public class MultiplicationTableSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            System.out.println(i + " x " + num + " = " + result);
            sum += result;
        }
        System.out.println("Sum = " + sum);
    }
}
