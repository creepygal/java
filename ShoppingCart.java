import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String [] fruits, veggies;
        fruits=new String[]{"apple","orange","banana","mango","pear","apricot","grape","berries","pomegranate","pineapple"};
        veggies=new String[] {"potato","spinach","celery","peas","eggplant","asparagus","beans","broccoli","lettuce","carrot","tomato"};
        displayf(fruits);
        displayv(veggies);
        System.out.println("Please enter how many fruits do u wish to buy: ");
        int a= input.nextInt();
        System.out.println("Please enter how many veggies do u wish to buy: ");
        int b= input.nextInt();
        String[] f=new String[a];
        String[] v=new String[b];
        inputf(f,a);
        inputv(v,b);
        System.out.println("\n\nYour bill: $"+10*a+" for "+a+" fruits and $"+10.5*b+" for "+b+" veggies purchased.");
        System.out.println("Total bill: $"+(10*a+10.5*b));
        System.out.println("\nThank you for Shopping at our Mart! \nHope to see you again!");
    }
    public static void displayf(String[] fruits){
        System.out.print("Available fruits are: [");
        for(String x : fruits)
            System.out.print(x + " ");
        System.out.println("]");
        System.out.println();
    }
    public static void displayv(String[] veggies){
        System.out.print("Available veggies are: [");
        for(String y : veggies)
            System.out.print(y + " ");
        System.out.println("]");
        System.out.println();
    }
    public static void inputf(String[] f,int a){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the fruits u wish to buy: ");
        for(int i=0;i<a;i++)
           f[i]=input.nextLine();
        System.out.print("\nFruits purchased are: [");
        for(String x : f)
        System.out.print(x + " ");
       System.out.println("]");

            
    }
    public static void inputv(String[] v,int b){
        Scanner input=new Scanner(System.in);
        System.out.println("\nPlease enter the veggies u wish to buy: ");
        for(int j=0;j<b;j++)
           v[j]=input.nextLine();
        System.out.print("\nVeggies purchased are: [");
        for(String y : v)
        System.out.print(y + " ");
       System.out.println("]");
    }
}

