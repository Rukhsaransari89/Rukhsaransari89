import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {

        try {
            FileWriter wr = new FileWriter("myfile.txt");
            String s = "fgfgfygiiurfh hjfhsfsfkgsfskdfgskdfshfyfgyifgrjfg hfgyrry hgwwuirer rkh fgferyr7r uruirrfrf";
            wr.write(s);
            wr.close();
            System.out.println("succefully add");
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
