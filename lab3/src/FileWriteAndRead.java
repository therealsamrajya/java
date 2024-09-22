import java.io.*;
import java.util.Scanner;

public class FileWriteAndRead {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a line to write to the file:");
        String inputLine = sc.nextLine();

        // Write the input to the file
        try (FileWriter fw = new FileWriter("myfile2.txt", true)) {
            fw.write(inputLine + "\n"); // Append input to the file and add a newline
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read and display the content of the file
        try (FileReader fr = new FileReader("myfile2.txt");
             BufferedReader br = new BufferedReader(fr)) {

            System.out.println("\nContent of the file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line from the file
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
