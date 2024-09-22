import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("myfile.txt");
            FileOutputStream fos = new FileOutputStream("copiedfile.txt");
            int i;
            while((i=fis.read())!=-1){

                fos.write(i);


                System.out.print((char) i);

            } 

            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}