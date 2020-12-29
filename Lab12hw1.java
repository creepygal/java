import java.io.*;
public class Lab12hw1 {
    public static void main(String[] args) {
      FileInputStream ins = null;
      FileOutputStream outs = null;
      try {
         File infile = new File("E:\\file1.txt");
         File outfile = new File("E:\\file2.txt");
         ins = new FileInputStream(infile);
         outs = new FileOutputStream(outfile);
         byte[] buffer = new byte[1024];
         int length;
         
         while ((length = ins.read(buffer)) > 0) {
            outs.write(buffer, 0, length);
         } 
         ins.close();
         outs.close();
         System.out.println("File1 has been copied to file2 successfully!!");
      } 
      catch(IOException e){
            System.out.println("Exception caught\n" + e);
        }
   }
}