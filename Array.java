import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number to choose menu option: ");
        System.out.println("1: For input and display the Array \n 2:For searching the element in array");
        System.out.println("3: For largest and smallest element display: ");
        System.out.println("4: For copying data to another array:");
        int n=input.nextInt();
        switch (n){
            case 1: {
                int[] a1=new int[1];
                int[] array=(Input(a1));
                display(array);
                break;
            }
            case 2: {
                int[] a1=new int[1];
                int[] array1=(Input(a1));
                System.out.println("Enter a number for search: ");
                int searchkey=input.nextInt();
                search(array1, searchkey);
                break;
            }
            case 3: {
                int[] a1=new int[1];
                int[] array2=(Input(a1));
                largest(array2);
                smallest(array2);
                break;
            }
            case 4: {
                int[] a1=new int[1];
                int[] array=(Input(a1));
                int[] copied =new int[10];
                copydata(array, copied);
                break;
            }
            default:
                System.out.println("Invalid number");
        }
    }
    public static int[] Input(int Array[]){
        int[] array1= new int[10];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("A["+i+"]= ");
            array1[i]=input.nextInt();
        }
        return array1;
    }
    public static void display(int A[]){
        for(int i=0;i<10;i++){
            System.out.println("A["+i+"]= "+A[i]);
        }
}
    public static void search(int[] array, int x){
        int flag=0;
        while (flag==0){
            for(int i=0;i<10;i++){
                if (array[i]==x){
                      System.out.println("Element found A["+i+"] "+array[i]);
                      flag++;
                }
               }
            if(flag==0){
                  System.out.println("Element not found...");
                  break;
            }
    }
  }
    public static void largest(int array[]){
        int k= array[0];
        for(int i=0;i<10;i++){
            if(array[i]>=k){
                k=array[i];
            }
        }
        System.out.println("Largest one at A[0] is: "+k);
}
    public static void smallest(int array[]){
        int k= array[9];
        for(int i=0;i<10;i++){
            if(k>=array[i]){
                k=array[i];
            }
        }
        System.out.println("Smallest one at A[9] is: "+k);
}
    public static void copydata(int array[],int copied[]){
        for(int i=0;i<10;i++){
            copied[i]=array[i];
            }
        for(int k=0;k<10;k++){
            System.out.println("New copied array B is ["+k+"]"+copied[k]);
            }
        }
}
    