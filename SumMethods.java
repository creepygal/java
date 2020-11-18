import java.util.Scanner;
public class SumMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int a=input.nextInt();
        System.out.println("Enter another value: ");
        int b=input.nextInt();
        System.out.println("Sum of the values is: "+sum(a,b));
    }
    public static long sum(int a,int b){
        int s=a+b;
        return s;
    }
}
