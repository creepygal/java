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
public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Floating point value:");
        float n= input.nextFloat();
        if (n>0)
            System.out.println("The given value is POSITIVE!");
        else if (n<0)
            System.out.println("The given value is NEGATIVE!");
        else
            System.out.println("The given value is ZERO!");
    }
}
