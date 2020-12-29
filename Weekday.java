
import java.util.Scanner;
public class Weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value between 1 to 7:");
        int day= input.nextInt();
        switch (day){
            case 1:
                System.out.println("The number is 1");
                System.out.println("The day is Saturday");
                break;
            case 2:
                System.out.println("The number is 2");
                System.out.println("The day is Sunday");
                break;
            case 3:
                System.out.println("The number is 3");
                System.out.println("The day is Monday");
                break;
            case 4:
                System.out.println("The number is 4");
                System.out.println("The day is tuesday");
                break;
            case 5:
                System.out.println("The number is 5");
                System.out.println("The day is Wednesday");
                break;
            case 6:
                System.out.println("The number is 6");
                System.out.println("The day is thursday");
                break;
            case 7:
                System.out.println("The number is 7");
                System.out.println("The day is Friday");
                break;
        }
}
}
