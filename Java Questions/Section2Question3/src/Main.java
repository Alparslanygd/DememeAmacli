import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double feet, meter;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for feet");
        feet = scan.nextDouble();
        meter = feet*0.305;

        System.out.println(+feet +" feet is " +meter +" meters.");

    }
}