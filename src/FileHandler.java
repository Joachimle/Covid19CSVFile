import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadAllCovid19Data() {
        ArrayList<Covid19Data> covid19Data = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data data = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            data = new Covid19Data(
                    (attributes[0]),
                    (attributes[1]),
                    (Integer.parseInt(attributes[2])),
                    (Integer.parseInt(attributes[3])),
                    (Integer.parseInt(attributes[4])),
                    (Integer.parseInt(attributes[5])),
                    (attributes[6])
            );

            covid19Data.add(data);

        }
        sc.close();
        return covid19Data;
    }
}
