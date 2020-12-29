
public class NewClass1 {
    public static void main(String[] args){
        double z= m(4,5);
        System.out.println(z);
    }
    public static double m(double x,double y){
        System.out.println("accessed1");
        return x;
    }
    public static double m(int x,double y){
        System.out.println("accessed");
        return x;
    }
}
