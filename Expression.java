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
public class Expression {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for x: ");
        int x= input.nextInt();
        System.out.print("Enter a value for y: ");
        int y= input.nextInt();
        System.out.print("Enter a value for a: ");
        int a= input.nextInt();
        System.out.print("Enter a value for b: ");
        int b= input.nextInt();
        System.out.print("Enter a value for c: ");
        int c= input.nextInt();
        System.out.println((3+4*x)/5-10*(y-5)*(a+b+c)/x+9*(4/x+(9+x)/y));
    }
    
}
