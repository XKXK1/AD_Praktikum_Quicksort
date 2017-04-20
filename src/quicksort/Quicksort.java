package quicksort;
public class Quicksort {
	private Pivotsuche pivotsuche = new PivotRandom();
	int pivot;


	public void sortieren(int a[], int ilinks, int irechts){
		pivot = pivotsuche.getPivot(a);
		quicksort(a, ilinks, irechts);
		
	};
	
	public int[] quicksort(int a[],int ilinks, int irechts) {
		int  i, j;
		if (irechts > ilinks) {
			
			i = ilinks;
			j = irechts - 1;


			while (true) {
				while (a[i] < pivot)
					i++;
				
				while (a[j] >= pivot && j>0)
					j--;// Vorsicht:
					

				if (i >= j)
					break;// in der Mitte getroffen
				swap(a,i, j);// vertauschen
			}
			swap(a,i, irechts);
			
			quicksort(a,ilinks, i - 1);
			quicksort(a,i + 1, irechts);
		}
		return a;
	}

	private void swap(int a[],int swap1, int swap2){
		int temp = a[swap1];
		a[swap1] = a[swap2];
		a[swap2] = temp;

	}

}
