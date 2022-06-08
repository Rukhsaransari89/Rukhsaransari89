import java.io.File;

// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Delete {
    public static void main(String[] args) {
        File f = new File("myfile.txt");
        if (f.delete()) {
            System.out.println(f.getName() + "" + "file is deleted");
        } else {
            System.out.println("file is not deleted");
        }

    }
}
