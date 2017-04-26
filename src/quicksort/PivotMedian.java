package quicksort;

public class PivotMedian implements Pivotsuche {
	
	private int median(int a, int b, int c) {
		return Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));
	}
	
	@Override
	public int getPivot(int[] array,int ilinks, int irechts) {
		return median(array[(int)(ilinks+irechts)/2],array[ilinks],array[irechts]);
	}

}
