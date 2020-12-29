import java.io.*;
public class Lab12act5 {
    public static void main(String[] args) throws Exception{
    try{
        BufferedWriter out= new BufferedWriter(new FileWriter("filename"));
        out.write("aString1\n (this string was already present in the file)\n");
        out.close();
        out=new BufferedWriter(new FileWriter("filename",true));
        out.write("aString2 \n(this string is appended in the file)");
        out.close();
        BufferedReader in=new BufferedReader(new FileReader("filename"));
        String str;
        while((str=in.readLine())!=null){
            System.out.println(str);
        }
        in.close();
    }
    catch (IOException e){
        System.out.println("exception occured"+e);
        }
    }
}
