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
public class Temperature {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature(in Celsius): ");
        double temp= input.nextDouble();
        if (temp<0)
            System.out.print("FREEZING! ");
        else if(temp<=15)
            System.out.print("COLD!");
        else if(temp<=30)
            System.out.print("WARM! ");
        else if(temp<=40)
            System.out.print("HOT! ");
        else if(temp>40)
            System.out.print("VERY HOT!!");
    }
}
    
}
