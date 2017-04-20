package quicksort;

public class TestQuicksort {


	public static void main(String[] args) {
		Quicksort sorter1 = new Quicksort();
		int zahlen[] = { 423, 2532, 22, 41 };

		sorter1.quickSort(zahlen, 0, 3);

		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i] + " ");
		}

	

	}

}
