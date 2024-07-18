package Aufgabe1;/*

Zur Lösung dieser Aufgabe ist etwas Recherche-Arbeit von Ihnen zu leisten.

Besorgen Sie sich Informationen über das Thema Binäre Suche. Schauen Sie dazu in die Literatur oder ins
Internet.
Beschreiben Sie bitte zunächst auf einer Seite, wie die Binäre Suche funktioniert und
welchen Aufwand die Methode hat (O-Notation).

Entwickeln und testen Sie bitte eine Java-Methode binsearch, die eine binäre Suche auf einem
int-Array realisiert. Die Methode gibt die Position eines gesuchten Wertes im int-Array
zurück bzw. -1, wenn der Wert nicht vorkommt.

*/
public class BinSearch {

        public static int binarysearch(int[] array, int target) {
                int low = 0;
                int high = array.length - 1;

                // Solange der Suchbereich gültig ist
                while (low <= high) {
                        int mid = low + (high - low) / 2;

                        // Wenn das mittlere Element der gesuchte Wert ist
                        if (array[mid] == target) {
                                return mid;
                        }

                        // Wenn der gesuchte Wert größer ist, ignoriere die linke Hälfte
                        if (array[mid] < target) {
                                low = mid + 1;
                        } else {
                                // Wenn der gesuchte Wert kleiner ist, ignoriere die rechte Hälfte
                                high = mid - 1;
                        }
                }

                // Wenn der Wert nicht gefunden wurde
                return -1;
        }

        public static void main(String[] args) {
                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int target = 7;
                int result = binarysearch(array, target);

                if (result == -1) {
                        System.out.println("Element nicht im Array gefunden.");
                } else {
                        System.out.println("Element gefunden an Index: " + result);
                }
        }
}
