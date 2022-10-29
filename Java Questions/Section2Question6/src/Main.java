import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, temp, sum, digit;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000. ");
        number = scan.nextInt();
        temp = number;
        sum = 0;
        while (temp > 0) {
            digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}