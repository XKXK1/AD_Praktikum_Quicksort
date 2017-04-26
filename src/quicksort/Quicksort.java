package quicksort;

public class Quicksort {

	private long counter;
	private Pivotsuche pivotsucheR = new PivotRandom();
	private Pivotsuche pivotsucheM = new PivotMedian();
	private Pivotsuche pivotsucheA = new PivotAnfang();

	public int[] quickSort(int a[], int ilinks, int irechts, int pivotMethode) {

		int pivot = 0, i, j;

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

		i = ilinks;
		j = irechts;

		while (i < j) {
			while (a[i] < pivot) {
				counter++;
				i++;
			}
			while (a[j] > pivot) {
				counter++;
				j--;
			}
			if (i <= j) {
				swap(a, i, j);
				i++;
				j--;
			}
		}

		if (ilinks < j)
			quickSort(a, ilinks, j, pivotMethode);
		if (i < irechts)
			quickSort(a, i, irechts, pivotMethode);
		return a;
	}

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
