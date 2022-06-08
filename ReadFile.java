import java.io.File;
import java.util.Scanner;

import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File f = new File("myfile.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String info = sc.nextLine();
                System.out.println("File is found");

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("not found");
        }

    }
}
