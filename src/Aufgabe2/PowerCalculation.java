package Aufgabe2;
/*
Schreiben Sie ein Java-Programm, das x y berechnet, wenn die Zahlen x und y eingegeben werden.

Verwenden Sie hierzu die Methode pow der Java Klasse Math.
Hinweise:

▪ Sie müssen sich in der Java API die Methode pow ansehen, um zu sehen, wie sie
aufgerufen wird. Wie findet man die Klasse Math in der Java 13 API?

▪ Wenn Sie ohne import arbeiten wollen, dann funktioniert das mit Math.pow(x,y).

▪ Wenn Sie import verwenden möchten, damit der Aufruf nur noch pow(x,y)heißt,
versuchen Sie es mit import static java.lang.Math.*;

Die Ausgabe des Programms sollte in etwa so aussehen:

Programm zur Berechnung der Potenz
Bitte geben Sie x ein: ___________
Bitte geben Sie y ein: ___________
Die Potenz von x hoch y ist: ______ .
*/
import java.util.Scanner;
import static java.lang.Math.*;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programm zur Berechnung der Potenz");
        System.out.print("Bitte geben Sie x ein: ");
        double x = scanner.nextDouble();

        System.out.print("Bitte geben Sie y ein: ");
        double y = scanner.nextDouble();

        double result = pow(x, y);

        System.out.println("Die Potenz von " + x + " hoch " + y + " ist: " + result);
    }
}
