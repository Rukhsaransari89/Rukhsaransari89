import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("rukhsar");
        ar.add("sameer");
        ar.add("alisha");
        ar.add("ali");
        ar.add("aarti");
        ar.add("rkr");
        ar.remove(3);
        System.out.println(ar);
        for (String i : ar) {
            System.out.println(i);
        }

    }
}
