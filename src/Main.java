import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.LocalDate.*;

public class Main {

    public static void main(String[] args) {

        // Ta reda på dagens datum
        LocalDate Idag = LocalDate.now();

        System.out.println("Dagens datum är " + Idag +"!");
        System.out.println("Idag är det " + Idag.getDayOfWeek() + "!");

        // Skriv ut vilken veckodag det är idag

    }
}
