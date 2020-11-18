import java.util.Scanner;
public class FibMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n= input.nextInt();
        int n1=0;int n2=1;
        System.out.println("Fibonacci Series of "+n+" is: "+ fibsequence(n1,n2));
    }
    public static int fibsequence(int n1,int n2){
            for(int i=1;i<=n;++i){
            System.out.print(n1+" ");
            int sumofprevtwo=n1+n2;
            n1=n2;
            n2=sumofprevtwo;
            return n;
    }
}
}
