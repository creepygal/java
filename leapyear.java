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
public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Leap Year:");
        int year= input.nextInt();
        boolean isLeapyear = (year%4==0 &&year%100!=0)||(year%400==0);
        System.out.println(year + " is a leap year? " + isLeapyear);
    } 
}
