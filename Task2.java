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
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired sentence: ");
        String message = input.nextLine();
        System.out.println("Enter the word to be changed: ");
        String word = input.next();
        System.out.println("Enter the word that you want after the replacement: ");
        String word1 = input.next();
        int place = message.indexOf(word);
        int length = word.length();
        int sum = place+length;   
        int last_index = message.length();
        if (place == 0)
            System.out.println(word1 + message.substring(sum, last_index));
        else
            System.out.println(message.substring(0, place) + word1 + message.substring(sum, last_index));
        
    }
    
}
