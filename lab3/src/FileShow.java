
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class FileShow {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("myFile1.txt");
            FileWriter fw = new FileWriter("myFile1.txt");
            System.out.println("Enter input");
            Scanner sc = new Scanner(System.in);

            String line = sc.nextLine();
            fw.write(line);

            fw.close();

            int i;

            while((i=fr.read())!=-1){
                System.out.print((char) i);
            }

            fr.close();


        } catch (Exception e) {
            System.out.println(e);
        }




    }
}