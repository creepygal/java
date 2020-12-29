import java.io.*;
//import java.io.IOException;
//import java.io.InputStreamReader;
public class Lab11act2 {
    public static void main(String args[]) throws Exception{
        try{
            byte bWrite[]={11,21,3,40,5};
            OutputStream os=new FileOutputStream("test.txt");
            for (int x=0; x<bWrite.length ;x++){
                os.write(bWrite[x]);
                os.close();
            }
            InputStream is=new FileInputStream("test.txt");
            int size=is.available();
            for(int i=0;i<size;i++){
                System.out.print((char)is.read()+ " ");
                is.close();
            }
        }
        catch(IOException e){
            System.out.println("Exception caught\n"+e);
        }
    }

}
