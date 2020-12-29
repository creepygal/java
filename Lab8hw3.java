import java.util.*;
public class Lab8hw3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[] array1= new int[10];
        int[] result =new int[array1.length];
        for(int i=0;i<10;i++){
            System.out.println("A["+i+"]= ");
            array1[i]=input.nextInt();
        }
        reverse(array1,result);
        System.out.print("Original array is: [");
        for(int x : array1)
        System.out.print(x + " ");
       System.out.println("]");
        
        System.out.print("Reversed array is: [");
        for(int y : result)
        System.out.print(y + " ");
       System.out.print("]");
    }
    public static void reverse(int[] array,int[] result){
        for(int i=0,j=result.length-1;i<array.length;i++,j--){
            result[j]=array[i];
        }
       return;
        
    }
}
