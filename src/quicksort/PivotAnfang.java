package quicksort;

public class PivotAnfang implements Pivotsuche {

	@Override
	public int getPivot(int[] array,int ilinks, int irechts) {
		return array[ilinks];
	}

}
