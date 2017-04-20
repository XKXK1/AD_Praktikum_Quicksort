package quicksort;

public class PivotMedian implements Pivotsuche {
	
	private int median(int a, int b, int c) {
	    if ( (a - b) * (c - a) >= 0 ) // a >= b and a <= c OR a <= b and a >= c
	        return a;
	    else if ( (b - a) * (c - b) >= 0 ) // b >= a and b <= c OR b <= a and b >= c
	        return b;
	    else
	        return c;
	}
	
	@Override
	public int getPivot(int[] array,int ilinks, int irechts) {
		return median(array[(int)(ilinks+irechts)/2],array[ilinks],array[irechts]);
	}

}
