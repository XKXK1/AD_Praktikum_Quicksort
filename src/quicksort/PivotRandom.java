package quicksort;

import java.util.Random;

public class PivotRandom implements Pivotsuche{

	@Override
	public int getPivot(int[] array,int ilinks,int irechts) {
		int index;
		Random random = new Random();
		index = random.nextInt(irechts);
		if (index <ilinks){
			index = ilinks;
		}
		return array[index];
	}
}
