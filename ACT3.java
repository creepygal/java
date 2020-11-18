import java.util.Scanner;
public class ACT3{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number= input.nextInt();
        boolean isPrime=true;
        while(number%2==0||number%3==0||number%5==0){
               isPrime=false;
               System.out.println("Please enter another number: ");
               number= input.nextInt();
           }
        }
}