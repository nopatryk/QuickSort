package quicksort;

public class QuickSort {

	public static void quickSort(int[] tab, int l, int r) {

		int splitValue = tab[(l + r) / 2]; // 
		int i = l, j = r;
		while (i <= j) {
			while (tab[i] < splitValue)
				i++;
			while (tab[j] > splitValue)
				j--;
			if (i <= j) {
				swap(tab, i, j);
				i++;
				j--;
			}
		}
		if (l < j)
			quickSort(tab, l, j);
		if (i < r)
			quickSort(tab, i, r);
	}

	public static void swap(int[] tab, int i1, int i2) {
		int container = tab[i1];
		tab[i1] = tab[i2];
		tab[i2] = container;
	}

}