import java.util.Scanner;
public class Sum {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        for (int i=1;i<11;i++){
            System.out.print("Enter value for "+ i +": ");
            int n= input.nextInt();
            if (n>0){
                sum+=n;
            }
        }
        System.out.print("Sum ="+ sum);
     }
}

        /*
        System.out.print("Enter 1st value: ");
        int n1= input.nextInt();
        System.out.print("Enter 2nd value: ");
        int n2= input.nextInt();
        System.out.print("Enter 3rd value: ");
        int n3= input.nextInt();
        System.out.print("Enter 4th value: ");
        int n4= input.nextInt();
        System.out.print("Enter 5th value: ");
        int n5= input.nextInt();
        System.out.println((3+4*x)/5-10*(y-5)*(a+b+c)/x+9*(4/x+(9+x)/y));
        */
    }
}
