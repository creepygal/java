
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
public class Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st floating point value:");
        double n1= input.nextDouble();
        System.out.print("Enter 2nd floating point value:");
        double n2= input.nextDouble();
        n1 =Math.floor(n1*100);
        n1=n1/100;
        n2=Math.floor(n2*100);
        n2=n2/100;
        if (n1==n2){
            System.out.println("They are same upto 2 decimal places.");
        }
        else
            System.out.print("No.. They are different");
    }
}
