
import java.util.*;
public class Lab8Hw2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[] array= new int[10];
        int[] multiply =new int[10];
        for(int i=0;i<10;i++){
            System.out.println("A["+i+"]= ");
            array[i]=input.nextInt();
        }
        System.out.print("Multiplied array is: [");
        modify(array,multiply);
        for(int x : multiply)
        System.out.print(x + " ");
       System.out.print("]");
    }
    public static void modify(int[] array,int[] multiply){
        for(int i=0;i<10;i++){
            multiply[i]=3*array[i];
        }
       return;
        
    }
}
