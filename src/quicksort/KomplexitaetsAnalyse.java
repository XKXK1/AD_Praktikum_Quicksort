package quicksort;

import java.util.ArrayList;
import java.util.Collections;

public class KomplexitaetsAnalyse {

	/**
	 * Fuellt das Array mit Zahlen 1 bis Listenlaenge.
	 * 
	 * @param liste
	 * @return
	 */
	public static int[] befuelleListe1(int liste[]) {
		for (int i = 1; i <= liste.length; i++) {
			liste[i - 1] = i;
		}
		return liste;
	}

	/**
	 * Fuellt das Array mit Zahlen Listenlaenge bis 1
	 * 
	 * @param liste
	 * @return
	 */
	public static int[] befuelleListe2(int liste[]) {
		for (int i = liste.length; i > 0; i--) {
			liste[liste.length - i] = i;
		}
		return liste;
	}

	/**
	 * Fuellt das Array mit Zahlen 1 bis Listenlaenge und aendert danach die
	 * Anordnung der Zahlen auf eine Zufaellige Reihenfolge
	 * 
	 * @param liste
	 * @return
	 */
	public static int[] befuelleListe3(int liste[]) {
		ArrayList<Integer> tempZahlen3 = new ArrayList<Integer>(liste.length);
		for (int i = 1; i <= liste.length; i++) {
			tempZahlen3.add(i);
		}
		Collections.shuffle(tempZahlen3);
		int[] zahlen3 = tempZahlen3.stream().mapToInt(i -> i).toArray();
		return zahlen3;
	}

	public static void testListe(int listenart, int pivotverfahren) {

		String ausgabe = "\n[";
		Quicksort sorter1 = new Quicksort();

		int listengroesse = 10;

		for (int i = 0; i < 4; i++) {
			int zahlenListe[] = new int[listengroesse];
			switch (listenart) {
			case 1:
				zahlenListe = befuelleListe1(zahlenListe);
				break;
			case 2:
				zahlenListe = befuelleListe2(zahlenListe);
				break;
			case 3:
				zahlenListe = befuelleListe3(zahlenListe);
				break;
			}

			sorter1.setCounter(0);
			sorter1.quickSort(zahlenListe, 0, zahlenListe.length - 1, pivotverfahren);
			ausgabe += "; " + sorter1.getCounter();
			sorter1.setCounter(0);
			listengroesse *= 10;

		}
		ausgabe += "]";
		System.out.print(ausgabe);
	}

	public static void main(String[] args) {

		testListe(1, 1);
		testListe(1, 2);
		testListe(1, 3);

		testListe(2, 1);
		testListe(2, 2);
		testListe(2, 3);

		testListe(3, 1);
		testListe(3, 2);
		testListe(3, 3);

	}

}
