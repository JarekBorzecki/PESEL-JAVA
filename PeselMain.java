package Practice_5;
import java.util.Scanner;

/**
 * Created by jarek on 03.07.2017.
 */
public class PeselMain {

    public static void main(String[] args) {

        Pesel pesel = new Pesel();
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj ile numerów pesel ma zostać wygenerowanych: ");
        int amountOfPesels = scan.nextInt();

        pesel.generatePesel(amountOfPesels);
    }
}
