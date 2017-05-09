package quicksort;

public class Quicksort {

	private long counter;
	private Pivotsuche pivotsucheR = new PivotRandom();
	private Pivotsuche pivotsucheM = new PivotMedian();
	private Pivotsuche pivotsucheA = new PivotAnfang();

	/**
	 * Quicksort sortiert ein int Array rekursiv. Die Zahlen werden am
	 * Pivotelement links und rechts in eine neu zu sortierende Liste
	 * aufgeteilt. Dies geschieht so lange, bis die ganze Liste sortiert ist.
	 * 
	 * 
	 * @param a
	 * @param ilinks
	 * @param irechts
	 * @param pivotMethode
	 * @return
	 */
	public int[] quickSort(int a[], int ilinks, int irechts, int pivotMethode) {

		int pivot = 0, i, j;

		// Switch case zum ermitteln der als Argument uebermittelten
		// Pivotmethode
		switch (pivotMethode) {
		case 1:
			pivot = pivotsucheA.getPivot(a, ilinks, irechts);
			break;
		case 2:
			pivot = pivotsucheM.getPivot(a, ilinks, irechts);
			break;
		case 3:
			pivot = pivotsucheR.getPivot(a, ilinks, irechts);
			break;
		}

		// Die beiden Zeiger die sich durch das Array bewegen
		i = ilinks;
		j = irechts;

		// Solange sich i von links und j von rechts noch nicht getroffen haben
		while (i < j) {
			// Zeiger von Links bewegt sich solange nach rechts, bis eine Zahl
			// groesser als Pivot gefunden wurde
			while (a[i] < pivot) {
				counter++;
				i++;
			}
			// Zeiger von Rechts bewegt sich solange nach links, bis eine Zahl
			// gefunden wird, die groesser als Pivot ist
			while (a[j] > pivot) {
				counter++;
				j--;
			}
			// Wenn die Zeiger sich noch nicht gekreuzt haben, wird das kleinere
			// element von rechts mit dem groesseren von links getauscht
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
				counter += 2;
			}
		}

		// Das Array wird aufgeteilt und die quickSort Methode wird bei jedem
		// der Beiden aufgeteilten Array erneut aufgerufen bis nichts mehr zum
		// sortieren uebrig bleibt
		if (ilinks < j)
			quickSort(a, ilinks, j, pivotMethode);
		if (i < irechts)
			quickSort(a, i, irechts, pivotMethode);
		return a;
	}

	/**
	 * Hilfsmethode zum swappen von zwei elementen. Argumente sind das Array und
	 * die beiden zu tauschenden indizes
	 * 
	 * @param a
	 * @param swap1
	 * @param swap2
	 */
	private void swap(int a[], int swap1, int swap2) {
		int temp = a[swap1];
		a[swap1] = a[swap2];
		a[swap2] = temp;
	}

	public long getCounter() {
		return counter;
	}

	public void setCounter(long counter) {
		this.counter = counter;
	}

}
