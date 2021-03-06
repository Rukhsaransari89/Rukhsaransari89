import java.io.File;

import javax.sound.sampled.SourceDataLine;

public class FileInfo {
    public static void main(String[] args) {
        File f = new File("myfile.txt");
        if (f.exists()) {
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.length());
            System.out.println(f.canExecute());
            System.out.println(f.getParentFile());
            System.out.println(f.getTotalSpace());
        }

    }

}
