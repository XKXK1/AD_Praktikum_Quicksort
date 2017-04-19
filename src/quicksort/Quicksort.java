package quicksort;
public class Quicksort {


	int[] quicksort(int a[],int ilinks, int irechts) {
		int pivot, i, j;
		if (irechts > ilinks) {
			
			i = ilinks;
			j = irechts - 1;
			
			
			pivot = a[irechts];

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

	void swap(int a[],int swap1, int swap2){
		int temp = a[swap1];
		a[swap1] = a[swap2];
		a[swap2] = temp;

	}

}
