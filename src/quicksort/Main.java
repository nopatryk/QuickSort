package quicksort;


public class Main {

	public static void main(String[] args) {

		int[] toSort = new int[] { 6, 2, 3 ,0,1,2,5,2,5};
		QuickSort.quickSort(toSort, 0, toSort.length-1);
			for (int item : toSort) 
				System.out.print(item + " ");
	}
}
