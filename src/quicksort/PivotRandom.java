package quicksort;

public class PivotRandom implements Pivotsuche{

	@Override
	public int getPivot(int[] array) {
		return array[(int) ((Math.random()*array.length))];
	}
}
