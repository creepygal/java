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
public class Hailstone {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int start = input.nextInt();
        System.out.println("Calculating..");
        int count=0;
        while(start>1){
            if(start%2==0){
                System.out.println(start+" is even, so I take half: "+start/2);
                start=start/2;
            }
            else{
                System.out.println(start+" is odd, so I make it 3n+1 : "+(3*start+1));
                start=(start*3)+1;
            }
            count++;
        }
        System.out.println("The process took "+count+" steps to reach 1.");
        }
    }

    