import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float subtotal, gratuity, total;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate");

        subtotal = scan.nextFloat();
        gratuity = scan.nextFloat()*subtotal/100;
        total = gratuity+ subtotal;
        System.out.println("The Gratuity is "+gratuity +" and total "+total);

    }
}