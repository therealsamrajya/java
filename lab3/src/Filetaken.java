import java.io.*;
import java.util.Scanner;

class User implements Serializable {
    String id;
    String name;
    String email;

    User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    String returnUser() {
        return id + " " + name + " " + email;
    }
}

class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        // Skip writing the header to avoid corrupting the file with multiple headers.
        reset();
    }
}

public class Filetaken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Writing to the file (serializing objects)
        try (FileOutputStream fos = new FileOutputStream("user1.txt", true)) {
            ObjectOutputStream oos;
            if (new File("user1.txt").length() == 0) {
                oos = new ObjectOutputStream(fos);  // Write the header if file is empty
            } else {
                oos = new AppendableObjectOutputStream(fos);  // Skip the header
            }

            for (int j = 1; j <= 5; j++) {
                System.out.println("Input User data " + j);


                System.out.println("Enter id:");
                String id = sc.nextLine();

                System.out.println("Enter name:");
                String name = sc.nextLine();

                System.out.println("Enter email:");
                String email = sc.nextLine();

                User user = new User(id, name, email);
                oos.writeObject(user);
            }

            oos.close();  // Close the ObjectOutputStream after use
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Reading from the file (deserializing objects)
        try (FileInputStream fis = new FileInputStream("user1.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            System.out.println("\nUsers in the file:");
            while (fis.available() > 0) {  // Loop until there's no more data to read
                User user = (User) ois.readObject();
                System.out.println("Id: " + user.id + " Name: " + user.name + " Email: " + user.email);
            }

        } catch (EOFException e) {
            // This exception is expected when the end of the file is reached
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
