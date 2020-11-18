
import java.util.Scanner;

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
public class Fibonacci {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n= input.nextInt();
        int n1=0;int n2=1;
        System.out.print("Fibonacci Series of "+n+" is: ");
        for(int i=1;i<=n;++i){
            System.out.print(n1+" ");
            int sumofprevtwo=n1+n2;
            n1=n2;
            n2=sumofprevtwo;
        }
      }
}
