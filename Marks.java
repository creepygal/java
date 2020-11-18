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
public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score= input.nextDouble();
        if (score>=91.0)
            System.out.print("A ");
        else if(score >=81.0)
            System.out.print("B");
        else if(score >=71.0)
            System.out.print("C ");
        else if(score >=61.0)
            System.out.print("D ");
        else if(score >=51.0)
            System.out.print("E ");
        else if(score <50.0)
            System.out.print("F ");
    }
}
