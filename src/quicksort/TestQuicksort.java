package quicksort;

public class TestQuicksort {

	public static void main(String[] args) {
		Quicksort sorter1 = new Quicksort();
		int zahlen[] = { 52, 432, 53, 2 };



		sorter1.sortieren(zahlen, 0, 3);

		
		
		for (int i = 0; i < zahlen.length; i++) {
			System.out.println(zahlen[i] + " ");
		}


	}

}
