import java.*;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args){
        try{
        Scanner input=new Scanner(System.in); 
        String[] u=new String [10];
        System.out.println("Please select from the options below:\n");
        System.out.println("1: Login");
        System.out.println("2: Signup");
        System.out.println("3: See Existing Users");
        System.out.println("4: Exit");
        int choice= input.nextInt();
        switch (choice){
            case 1:
                String Username=null;
                String Password=null; 
                System.out.println("Welcome Back!");
                login(Username,Password);
                break;
            case 2:
                Username=null;
                Password=null; 
                System.out.println("Welcome to the Platform!");
                signup(Username,Password);
                break;
            case 3:
                System.out.println("Please check from the following:");
                users(u);
                break;
            case 4:
                System.out.println("Good Bye! ");
                break;
    }
        }
        catch(Exception e){
            System.out.println("Exception caught: \n"+e);
        }
    }
    public static void login(String Username, String Password){
        try{
            Scanner input= new Scanner(System.in);
            System.out.println("Enter your UserName:");
            Username= input.nextLine();
            System.out.println("Enter your Password:");
            Password= input.nextLine();
            if(Username.equals("admin") && Password.equals("123")){
                System.out.println("Login Successful!\nWelcome to the ATM machine!");
                System.out.println("What would you like to do?");
                System.out.println("Please select from the options below:\n");
        System.out.println("1: Change username");
        System.out.println("2: Change password");
        int choice= input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter your UserName:");
                Username= input.nextLine();
                break;
            case 2:
                System.out.println("Enter your Password:");
                Password= input.nextLine();
                break;
        }
            }
            else
                System.out.println("Sorry! Incorrect username or password...");
        }
        catch(Exception e){
            System.out.println("Exception caught: \n"+e);
        }
    }
    public static void signup(String Username, String Password){
        try{
            Scanner input= new Scanner(System.in);
            System.out.println("Enter your Name:");
            String name= input.nextLine();
            System.out.println("Enter your UserName:");
            Username= input.nextLine();
            System.out.println("Choose a strong Password:");
            Password= input.nextLine();
            System.out.println("\t Your Account has been successfully created!");
            System.out.println("Welcome"+ name +"!");
           }
        catch(Exception e){
            System.out.println("Exception caught: \n"+e);
        }
    }
    public static void users(String[] users){
        System.out.print("Available users are: [");
        for(String x : users)
            System.out.print(x + " ");
        System.out.println("]");
        System.out.println();
    }
}

