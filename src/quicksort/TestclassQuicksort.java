package quicksort;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class TestclassQuicksort {

	@Test
	public void sortierenpivot1() {
		int zahlen1[] = new int[10000];
		int zahlen2[] = new int[10000];
		int zahlen3[] = new int[10000];

		befuelleListe1(zahlen1);
		befuelleListe2(zahlen2);
		zahlen3 =befuelleListe3(zahlen3);

		int zahlenerwartet[] = new int[10000];

		
		System.arraycopy(zahlen1, 0, zahlenerwartet, 0, zahlen1.length);


		Quicksort sorter1 = new Quicksort();

		sorter1.quickSort(zahlen1, 0, zahlen1.length - 1, 1);
		sorter1.quickSort(zahlen2, 0, zahlen2.length - 1, 1);
		sorter1.quickSort(zahlen3, 0, zahlen3.length - 1, 1);

		
		
		for(int i = 0; i < zahlen1.length; i++){
			assertEquals(zahlenerwartet[i], zahlen1[i]);
			}
		for(int i = 0; i < zahlen2.length; i++){
			assertEquals(zahlenerwartet[i], zahlen2[i]);
			}
		for(int i = 0; i < zahlen3.length; i++){
			assertEquals(zahlenerwartet[i], zahlen3[i]);
			}
			

	}

	@Test
	public void sortierenpivot2() {
		int zahlen1[] = new int[10000];
		int zahlen2[] = new int[10000];
		int zahlen3[] = new int[10000];

		befuelleListe1(zahlen1);
		befuelleListe2(zahlen2);
		zahlen3 =befuelleListe3(zahlen3);

		int zahlenerwartet[] = new int[10000];

		
		System.arraycopy(zahlen1, 0, zahlenerwartet, 0, zahlen1.length);


		Quicksort sorter1 = new Quicksort();

		sorter1.quickSort(zahlen1, 0, zahlen1.length - 1, 2);
		sorter1.quickSort(zahlen2, 0, zahlen2.length - 1, 2);
		sorter1.quickSort(zahlen3, 0, zahlen3.length - 1, 2);

		
		
		for(int i = 0; i < zahlen1.length; i++){
			assertEquals(zahlenerwartet[i], zahlen1[i]);
			}
		for(int i = 0; i < zahlen2.length; i++){
			assertEquals(zahlenerwartet[i], zahlen2[i]);
			}
		for(int i = 0; i < zahlen3.length; i++){
			assertEquals(zahlenerwartet[i], zahlen3[i]);
			}
			

	}

	@Test
	public void sortierenpivot3() {

			int zahlen1[] = new int[10000];
			int zahlen2[] = new int[10000];
			int zahlen3[] = new int[10000];

			befuelleListe1(zahlen1);
			befuelleListe2(zahlen2);
			zahlen3 =befuelleListe3(zahlen3);

			int zahlenerwartet[] = new int[10000];

			
			System.arraycopy(zahlen1, 0, zahlenerwartet, 0, zahlen1.length);


			Quicksort sorter1 = new Quicksort();

			sorter1.quickSort(zahlen1, 0, zahlen1.length - 1, 3);
			sorter1.quickSort(zahlen2, 0, zahlen2.length - 1, 3);
			sorter1.quickSort(zahlen3, 0, zahlen3.length - 1, 3);

			
			
			for(int i = 0; i < zahlen1.length; i++){
				assertEquals(zahlenerwartet[i], zahlen1[i]);
				}
			for(int i = 0; i < zahlen2.length; i++){
				assertEquals(zahlenerwartet[i], zahlen2[i]);
				}
			for(int i = 0; i < zahlen3.length; i++){
				assertEquals(zahlenerwartet[i], zahlen3[i]);
				}
				
		}

	/**
	 * Fuellt das Array mit Zahlen 1 bis Listenlaenge.
	 * 
	 * @param liste
	 * @return
	 */
	public int[] befuelleListe1(int liste[]) {
		for (int i = 1; i <=liste.length; i++) {
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
	public int[] befuelleListe2(int liste[]) {
		for (int i = liste.length; i > 0; i--) {
			liste[i-1] = i;
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
	public int[] befuelleListe3(int liste[]) {
		ArrayList<Integer> tempZahlen3 = new ArrayList<Integer>(liste.length);
		for (int i = 1; i <= liste.length; i++) {
			tempZahlen3.add(i);
		}
		Collections.shuffle(tempZahlen3);
		int[] zahlen3 = tempZahlen3.stream().mapToInt(i -> i).toArray();
		return zahlen3;
	}

}
