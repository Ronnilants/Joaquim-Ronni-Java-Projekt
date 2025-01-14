import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Seitenlänge
        System.out.print("Geben Sie die Seitenlänge ein: ");
        int seitenLaenge = scanner.nextInt();

        // Äußere Schleife für die Zeilen
        for (int i = 1; i <= seitenLaenge; i++) {
            // Innere Schleife für die Spalten
            for (int j = 1; j <= seitenLaenge; j++) {
                // Ausgabe des Produkts von Zeile (i) und Spalte (j)
                System.out.print((i * j) + "\t");
            }
            // Zeilenumbruch
            System.out.println();
        }

        scanner.close();
    }
}
