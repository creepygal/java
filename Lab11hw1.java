import java.io.*;
public class Lab11hw1 {
    public static void main(String[] args) throws Exception{
        try{
            Writer output=null;
            File file= new File("E:\\filename.txt");
            file.createNewFile();
            output=new BufferedWriter(new FileWriter(file));
            output.close();
            System.out.println("File has been created in directory E with name (filename)");
        }
        catch(Exception e){
            System.out.println("Exception caught \n" + e);
        }
    }
}
