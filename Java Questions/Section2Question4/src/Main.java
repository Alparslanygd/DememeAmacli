import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pound, kilogram;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in pounds");
        pound = scan.nextDouble();
        kilogram = pound * 0.454;
        System.out.println(+pound + " Pounds is " + kilogram + " kilograms.");
    }
}