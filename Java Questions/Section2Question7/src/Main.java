import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers of minutes");
        double numbers = scan.nextDouble();
        int years = (int) (numbers / 60 / 24) / 365;
        int days = (int) (numbers / 60 / 24) % 365;
        System.out.println(numbers + " minutes is approximately " + years + " years and " + days + " days.");
    }
}