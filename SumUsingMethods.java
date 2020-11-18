public class SumUsingMethods {
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is : "+sum(1,10));
        System.out.println("Sum from 11 to 20 is : "+sum(11,20));
        System.out.println("Sum from 21 to 30 is: "+sum(21,30));
    }
    public static int sum(int a,int b){
        int result=0;
        for (int i=a;i<=b;i++){
            result +=i;
        }
        return result;
    }
}