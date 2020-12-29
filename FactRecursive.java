import java.util.*;
public class FactRecursive {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int x=input.nextInt();
        System.out.println("Factorial of the entered number is: "+factorial(x));
    }
    public static long factorial(int n){
        if(n==0)
            return 1;
        else
            return(n*factorial(n-1));
    }
}
