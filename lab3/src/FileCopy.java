import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        try {
            FileInputStream in = new FileInputStream("myfile.txt");
            FileOutputStream out = new FileOutputStream("copiedfile.txt");

            int content;
            while ((content = in.read()) != -1) {
                out.write(content);
            }

            in.close();
            out.close();
            System.out.println("File copied");
        } catch (IOException e) {
            System.out.println("Error occured" + e.getMessage());
        }

    }
    }
