import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, area, volume, pi, lenght;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter he radius and length of a cylinder: ");
        radius = scan.nextDouble();
        lenght = scan.nextDouble();

        area = radius*radius*Math.PI;
        volume = area*lenght;
        System.out.println("The Area is: " +area);
        System.out.println("The Volume is: " +volume);
    }
}