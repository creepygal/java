import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int a=input.nextInt();
        if(isPrime(a)==true)
            System.out.println("The given number is Prime.");
        else
            System.out.println("The given number is not Prime");
    }
    public static boolean isPrime(int x){
        boolean prime=true;
        for (int i=2;i<x/2;i++){
            int r=x%1;
            if (r==1){
                prime=false;
                break;
            }
        }
        return prime;
    }
}
