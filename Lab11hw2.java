import java.io.*;
public class Lab11hw2 {
    public static void main(String[] args) throws Exception{
        try{
            Writer output=null;
            File file= new File("E:\\filename.txt");
            file.createNewFile();
            output=new BufferedWriter(new FileWriter(file));
            output.close();
            System.out.println("File has been created in directory E with name (filename)");
            if(file.exists()){
                System.out.println("The file exists");
            }
            else
                System.out.println("The file does not exist! ");
        }
        catch(Exception e){
            System.out.println("Exception caught \n" + e);
        }
    }
}
