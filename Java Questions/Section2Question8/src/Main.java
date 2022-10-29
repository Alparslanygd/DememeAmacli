import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat time = new SimpleDateFormat("h:m:s");
        Date time2 = new Date();
        System.out.println("enter the time zone");
        Scanner scan = new Scanner();
        int time3 = scan.nextInt();
        String currentTime = time.format(time2)+time3;
        System.out.println(currentTime);


    }
}