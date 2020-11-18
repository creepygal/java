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
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String message = input.nextLine();
        System.out.println("Enter the first word to be replaced: ");
        String word1 = input.next();
        System.out.println("Enter the next word: ");
        String word2 = input.next();
        int ind = message.indexOf(word1);
        int lgh = word1.length();
        int sum = ind+lgh; 
        int ind1 = message.indexOf(word2);
        int lgh1 = word2.length();
        int y2 = ind1+lgh1;
        int last_index = message.length();
        if (ind == 0)
            System.out.println(word2 + message.substring(sum, ind1) + word1 + message.substring(y2, last_index));
        else
            System.out.println(message.substring(0, ind) + word2 + message.substring(sum, ind1) + word1 + message.substring(y2, last_index));
    }
}
