import java.util.Scanner;
public class Array4 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int row=0;
        int col=0;
        int [][] A= new int[3][3];
        int [][] B= new int[3][3];
        int C;
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print("A["+row+"]"+" ["+col+" ]");
                A[row][col]=input.nextInt();
            }
        }
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print("B["+row+"]"+" ["+col+" ]");
                B[row][col]=input.nextInt();
            }
        }
        System.out.println("This is A before getting Swapped:");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("This is B before getting Swapped:");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(B[row][col]+" ");
            }
            System.out.println();
        }
        //Swapping starts
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C=A[i][j];
                A[i][j]=B[i][j];
                B[i][j]=C;
            }
        }
        System.out.println("This is A after getting Swapped:");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("This is B after getting Swapped:");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(B[row][col]+" ");
            }
            System.out.println();
        }
    }
}
