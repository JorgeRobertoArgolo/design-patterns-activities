package activity_builder;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private List<String> parts = new ArrayList<>();


    public void addPart(String part) {
        this.parts.add(part);
    }

    public void showReports () {
        System.out.println("------- Final Reports ------");
        for (String part: this.parts) {
            System.out.println(part);
        }
        System.out.println("----------------------------");
    }
}
