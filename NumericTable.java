import java.util.Scanner;
public class NumericTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int a=input.nextInt();
        table(a);
    }
    public static int table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(i+" * "+n+" = "+(i*n));
        }
    }
}