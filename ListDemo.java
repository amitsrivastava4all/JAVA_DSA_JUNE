import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> report = new CopyOnWriteArrayList<>();
        //ArrayList<String> report = new ArrayList<>();
        report.add("HTML Generated...");
        report.add("CSS Generated...");
        for(String s : report){
            System.out.println(s);
            report.add("JS Generated...");
            report.add("Font Generated...");
        }
        System.out.println("After Write... "+report);
    }
}
