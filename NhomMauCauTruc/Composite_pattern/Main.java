package Composite_pattern;
import java.text.ParseException;
public class Main {

        public static void main(String[] args) throws ParseException {

            AbstracFile f1 = new File("a1", "a", "c");
            AbstracFile f2 = new File("a2", "b", "c");
            AbstracFile f3 = new File("a3", "c", "c");
            AbstracFile f4 = new File("a4", "d", "c");

            AbstracFile F = new Folder("C:\\", "F1", "27/4/2023");
            AbstracFile F2 = new Folder("C:\\", "F2", "27/4/2023");
            AbstracFile F3 = new Folder("C:\\", "F3", "27/4/2023");
            AbstracFile F4 = new Folder("C:\\", "F4", "27/4/2023");
            F.add(F2);
            F.add(f1);
            F.add(f2);
            F.add(f3);
            F.add(f4);
            F.add(F3);
            F2.add(F4);
            F.remove(F4);
            System.out.println(F.getStringTreeFolder());

        }

}
