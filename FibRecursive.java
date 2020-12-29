import java.util.*;
public class FibRecursive {
    Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter the numbers required to generate a fibonacci sequence: ");
        int number=new Scanner(System.in).nextInt();
        System.out.println("Fibonacci series upto "+number+" numbers");
        for (int i=1;i<=number;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static int fibonacci(int number){
            if(number==1 || number==2){
                return 1;
            }
            int fibo1=1,fibo2=1,fibonacci=1;
            for(int i=3;i<=number;i++){
                fibonacci=fibo1+fibo2;
                fibo1=fibo2;
                fibo2=fibonacci;
            }
            return fibonacci;
    }
}
