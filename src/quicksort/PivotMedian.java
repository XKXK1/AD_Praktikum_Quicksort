package quicksort;

public class PivotMedian implements Pivotsuche {

	@Override
	public int getPivot(int[] array) {
		return (array[0]+array[array.length/2]+array[array.length-1])/3;
		
	}

}
