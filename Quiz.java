import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
 int correctCount = 0; // Count the number of correct answers
 int count = 0; // Count the number of questions
 String output = " Quiz "; // output string is initially empty
 Scanner input = new Scanner(System.in);
 while (correctCount<3) {
 // 1. Generate two random single-digit integers
 int number1 = (int)(10+ Math.random() * 99);
 int number2 = (int)(10+ Math.random() * 99);
 // 2. If number1 < number2, swap number1 with number2
 if (number1 < number2) {
 int temp = number1;
 number1 = number2;
 number2 = temp;
 }
 // 3. Prompt the student to answer "What is number1 – number2?"
 System.out.print("What is " + number1 + " - " + number2 + "? ");
 int answer = input.nextInt();
 // 4. Grade the answer and display the result
 if (number1 - number2 == answer) {
    System.out.println("You are correct!");
    correctCount++; // Increase the correct answer count
 }
 else{
    System.out.println("Your answer is wrong.\n" + number1
    + " - " + number2 + " should be " + (number1 - number2));
    count++;
 }
 output += "\n" + number1 + "-" + number2 + "=" + answer +
 ((number1 - number2 == answer) ? " correct" : " wrong");
 }
 System.out.println("You got "+count+" questions wrong");
}
}
