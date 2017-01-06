public class QuickSort {
	private static int[] a;
	public static int cut = 3;

	public static void quickSort(int[] A, int lo, int hi) {
		a = A;
		if (lo < hi) {
			int q = partition(a, lo, hi);
		quickSort(a, lo, q - 1);	
		quickSort(a, q + 1, hi);
		}
	}
	
	public static int partition(int[] A , int lo, int hi) {
		int x = A[hi];
		int i = lo - 1;
		for (int j = lo; j < hi; j++) {
			if (A[j] <= x) {
				i =i+ 1;
				swap(i, j);
			}
		}
		swap( i + 1, hi);

		return i + 1;
	}
	public static void swap( int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void medianQuickSort(int[] A, int lo, int hi) {
		int N = lo - hi + 1;
		//if (N <= cut) 
			//InsertionSort(A, lo, hi);
		//else {
		int m = Median3(A, lo, lo + N/2, hi);
		swap( A[m], A[lo]);
		int q = partition(A, lo, hi);
		
		medianQuickSort(A, lo, q - 1);
		medianQuickSort(A, lo + 1, hi);
		//}
	}
	
private static int Median3(int[] arr, int low, int i, int high) {
		
		int M = (low + high)/2;
		if(arr[low] >arr[M])
			swap(low, M);
		if(arr[low] > arr[high] )
			swap(low, high);
		if(arr[M] >arr[high])
			swap(M,high);
		
		swap(M, high-1);

		return arr[high-1];
	}

	private static void InsertionSort(int[] A, int lo, int hi) {
		
		int length =A.length;
		for  (int j = 1; j < length; j++){
			int k = A[j];
			int i = j -1;
			while ((i >= 0) && (A[i] > k)){
				A[i+1] = A[i];
				i = i -1;
				A[i+1] = k;
			
	}
}
}
}
