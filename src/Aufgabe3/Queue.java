package Aufgabe3;

import javax.swing.*;

/*
Definieren Sie eine Klasse Queue. Eine Queue (deutsch: Schlange) ist eine Datenstruktur, bei
der man das erste Element entnehmen kann (dequeue).

Ein Datenelement kann nur an das
Ende der Schlange angefügt werden (enqueue).

Zusätzlich sind in der Klasse die
Initialisierung (über den Konstruktor) und die Abfragen, ob die Schlange leer (is_empty())
bzw. voll (is_full()), definiert.

Die Schlange soll Integerzahlen aufnehmen können und
hat die folgenden Instanzvariablen:

private int nextFree;
private int[] arr;

Dabei gibt nextFree den Index der ersten freien Stelle in der Schlange an und das Array
enthält die Elemente der Schlange. Freie Plätze werden enthalten eine 0.

Beispiel:
Schlange[5]: 10 20 30 0 0 nextFree = 3
(1) s.dequeue() lässt 10 die Schlange verlassen:
20 30 0 0 0 nextFree = 2
(2) s.enqueue(100) fügt 100 an das Ende der Schlange ein:
20 30 100 0 0 nextFree = 3
Seite 3 von 5
(3) s.dequeue()
s.dequeue()
s.dequeue()
s.is_empty() liefert true
0 0 0 0 0 nextFree = 0

Neben der Implementierung der Klasse Queue besteht Ihre Aufgabe darin, eine Anwendung
zu schreiben, die eine Warteschlange für Integerzahlen simuliert.
Formulieren Sie in der
Anwendung 3 Szenarien so wie im Beispiel dargestellt, die zeigen, dass die Schlange
ordnungsgemäß funktioniert und Fehlermeldungen wie „Schlange voll“ und „Schlange leer“
ausgibt.

 */
public class Queue {
    private int nextFree;
    private int[] arr;

    // Konstruktor
    public Queue(int size) {
        arr = new int[size];
        nextFree = 0;
    }

    // Fügt ein Element an das Ende der Schlange ein
    public void enqueue(int value) {
        if (is_full()) {
            System.out.println("Schlange voll");
        } else {
            arr[nextFree] = value;
            nextFree++;
        }
    }

    // Entfernt das erste Element aus der Schlange
    public int dequeue() {
        if (is_empty()) {
            System.out.println("Schlange leer");
            return -1; // Rückgabewert für Fehlerfall
        } else {
            int first = arr[0];
            for (int i = 0; i < nextFree - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[nextFree - 1] = 0;
            nextFree--;
            return first;
        }
    }

    // Prüft, ob die Schlange leer ist
    public boolean is_empty() {
        return nextFree == 0;
    }

    // Prüft, ob die Schlange voll ist
    public boolean is_full() {
        return nextFree == arr.length;
    }

    // Gibt die Elemente der Schlange aus
    public void printQueue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue s = new Queue(5);

        // Szenario 1
        System.out.println("Szenario 1:");
        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);
        s.printQueue();
        s.dequeue();
        s.printQueue();
        s.enqueue(100);
        s.printQueue();
        System.out.println();

        // Szenario 2
        System.out.println("Szenario 2:");
        s.enqueue(40);
        s.enqueue(50);
        s.enqueue(60); // Dies sollte "Schlange voll" ausgeben
        s.printQueue();
        System.out.println();

        // Szenario 3
        System.out.println("Szenario 3:");
        s.dequeue();
        s.dequeue();
        s.dequeue();
        s.dequeue();
        s.printQueue();
        System.out.println("Schlange leer: " + s.is_empty());
        s.dequeue(); // Dies sollte "Schlange leer" ausgeben
        System.out.println();
    }
}
