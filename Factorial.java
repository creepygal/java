import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int value=input.nextInt();
        long fact= factorial(value);
        System.out.println("Factorial of "+value+" is "+ fact);
    }
    public static long factorial(int n){
        long f=1;
        for(int i=n;i>0;i--)
            f=f*i;
        return f;
    }
}
