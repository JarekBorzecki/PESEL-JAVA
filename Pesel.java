package Practice_5;
import java.util.Random;

/**
 * Created by jarek on 02.07.2017.
 */
public class Pesel {

    public static void generatePesel(int value) {
        Random los = new Random();

        for (int i = 0; i < value; i++) {
            String pesel = "";

            for (int j = 0; j < 11; j++) {
                int number = los.nextInt(10);
                pesel = pesel + number;

                if (j == 5) {
                    pesel = pesel + "-";
                }
            }
            System.out.println("Czy osoba o numerze PESEL: " + pesel + " jest kobietą? " + isFemale(pesel));
        }
    }

    // Funkcja która sprawdza, czy osoba o danym numerze PESEL jest kobietą
    public static boolean isFemale(String pesel) {
        for (int i = 0; i < pesel.length(); i++) {
            char sign = pesel.charAt(i);
            int number = Character.getNumericValue(sign);

            /* Przyjąłem, że jeśli pierwsza liczba drugiej części numeru PESEL jest parzysta,
            to osoba jest kobietą
             */
            if (i == 7 && (number % 2 == 0)) {
                return true;
            }
        }
        return false;
    }
}
