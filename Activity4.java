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
public class Activity4 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int highestScore = 0; 			
	String highestScoreName = ""; 
	System.out.print("Enter the number of students: ");
	int numberOfStudents = input.nextInt();
	System.out.println("Enter each student’s name and score");
	for (int i = 0; i < numberOfStudents; i++) {
	        System.out.print("Student: " + (i + 1) +"\n   Name: ");
		String name = input.next();
		System.out.print("   Score: ");
		int score = input.nextInt();
                if (score<0)
                    break;
                if (score > highestScore)
		{
			highestScore = score;
			highestScoreName = name;
		}
}
		System.out.println("Student with the highest score: " + highestScoreName);
	}
}
