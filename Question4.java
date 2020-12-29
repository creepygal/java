import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int a=input.nextInt();
        while(a%2==0)
            table(a);
        a=input.nextInt();
    }
    public static int table(int n){
        for (int i=1;i<=20;i++){
            System.out.println(i+" * "+n+" = "+(i*n));
        }
        return n;
    }
}