import java.util.Scanner;
public class MarksUsingMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        double score= input.nextDouble();
        System.out.println("Your grade is: " + grade(score));
    }
    public static String grade(double score){
        if (score>=91.0)
            return ("A ");
        else if(score >=81.0)
            return ("B");
        else if(score >=71.0)
            return ("C ");
        else if(score >=61.0)
            return ("D ");
        else if(score >=51.0)
            return ("E ");
        else if(score <50.0)
            return ("F ");
    }
}
