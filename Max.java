/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nazzish Shahid
 */
import java.util.Scanner;
public class Max {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first integer:" );
        int n1= input.nextInt(); 
        System.out.println("Enter the second integer:" );
        int n2= input.nextInt(); 
        System.out.println("The maximum of the two numbers is: "+ max(n1,n2));
    }
    public static int max(int n1,int n2){
        int max;
        if (n1>n2)
            return max=n1;
        else
            return max=n2;
    }
}
