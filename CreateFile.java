import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File f = new File("myfile.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("file created " + f.getName());

            } else {
                System.out.println("file is already exist");
            }
        } catch (IOException e) {
            System.err.println("some thing is wrong");
        }
    }

}
