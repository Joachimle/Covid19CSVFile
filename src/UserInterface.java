import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class UserInterface {
    private int command = 99;
    private final int SENTINEL = 0;

    public UserInterface(){
        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();
        ArrayList<Covid19Data> covidData = fh.loadAllCovid19Data();

        System.out.println("Hvordan ønsker du at sortere din data?");
        while (command != SENTINEL) {
            System.out.println("Tast 1 for region");
            System.out.println("Tast 2 for aldersgruppe");
            System.out.println("Tast 0 for at afslutte");
            command = sc.nextInt();
            switch (command) {
                case 1 -> {
                    System.out.println("Du har valgt at sortere efter region");
                    Collections.sort(covidData, new RegionComparator());
                    for (Covid19Data data : covidData) {
                        System.out.println(data);
                    }
                }
                case 2 -> {
                    System.out.println("Du har valgt at sortere efter aldersgruppe");
                    Collections.sort(covidData, new AldersGruppeComparator());
                    for (Covid19Data data : covidData) {
                        System.out.println(data);
                    }
                }
                case 0 -> System.out.println("Du har valgt af afslutte programmet");

            }
        }
    }

}
