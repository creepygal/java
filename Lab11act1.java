import java.io.*;
public class Lab11act1 {
    public static void main(String args[])throws IOException{
        InputStreamReader cin=null;
        try{
            cin=new InputStreamReader(System.in);
            System.out.println("Enter characters:   (type 'q' to exit and quit the program) ");
            char c;
            do{
                c= (char)cin.read();
                System.out.println(c);
            }
            while(c!='q');
        }
        finally{
            if (cin!=null){
                cin.close();
            }
        }
    }
}
