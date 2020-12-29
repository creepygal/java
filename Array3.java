import java.util.Scanner;
public class Array3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[][] matrix= new int[10][10];
        int row;
        for(row=0;row<4;row++){
            for(int col=0;col<4;col++){
                matrix[row][col]=input.nextInt();
            }
        }
        for(row=0;row<4;row++){
            for(int col=0;col<4;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
