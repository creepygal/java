
public class table {
    public static void main(String[] args) {
    System.out.println("\t\tMultiplication Table");
    int n;int i;int j;
    for(n=1;n<10;n++){
        System.out.printf("%6d",n);
         }
    System.out.print("\n---------------------------------------------------------------\n");
    for (i=1;i<10;i++){
             System.out.print(i+"|");
             for(j=1;j<10;j++){
                 System.out.printf("%6d",i*j);
             }
             System.out.println();
    }
    }
}
