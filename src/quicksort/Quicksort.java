package quicksort;

public class Quicksort {

	private Pivotsuche pivotsucheR = new PivotRandom();
	private Pivotsuche pivotsucheM = new PivotMedian();
	private Pivotsuche pivotsucheA = new PivotAnfang();

	public int[] quickSort(int a[], int ilinks, int irechts) {
		int pivot, i, j;
		i=ilinks;
		j=irechts;
		pivot = pivotsucheM.getPivot(a, ilinks, irechts);
		
		while (i < j) {
               
	            while (a[i] < pivot) {
	                i++;
	            }
	            while (a[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                swap(a,i, j);
	                i++;
	                j--;
	            }
	        }
	        
	        if(ilinks < j)
	         quickSort(a,ilinks, j);
	        if (i < irechts)
	         quickSort(a, i,irechts);
	        return a;
	}

	private void swap(int a[], int swap1, int swap2) {
		int temp = a[swap1];
		a[swap1] = a[swap2];
		a[swap2] = temp;

	}

}
