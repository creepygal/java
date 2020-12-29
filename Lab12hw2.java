import java.io.*;
public class Lab12hw2 {
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
                System.out.println("the file "+ file.getName()+" is going to be deleted");
                file.delete();
                System.out.println("Does the file exist? "+ file.exists());
                System.out.println("Hence, The file has been deleted..");
            }
            else
                System.out.println("The file does not exist! ");
        }
        catch(Exception e){
            System.out.println("Exception caught \n" + e);
        }
    }
}
