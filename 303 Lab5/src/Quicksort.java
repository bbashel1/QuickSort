

public class Quicksort {
	private static int[] a;
	public static int CUTOFF = 10;

	public static void sort(int[] arr, int low, int high) {
		a = arr;
		if (low < high) {
		int	q = partition(a, low, high);
			sort(a, low, q - 1);
			sort (a, q + 1, high);
		}
	}
	public static int partition(int[] arr, int low, int high) {
		int x = arr[high];
		int i = low-1;
		for (int j = low; j < high;j++) {
			if (arr[j] <= x) {
				i = i + 1;
				exchange(i,j);
			}
		}
		exchange(i+1,high);
		return i+1;
	}
	public static void exchange( int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static void QuickSort(int[]arr, int low, int high){
		int N = low - high +1;
	if( N <= CUTOFF)
			InsertionSort(arr, low, high);
		else{
			int m = Median3(arr, low, low + N/2, high);
			exchange(arr[m], arr[low]);
			int q = partition(arr, low, high);
		
		QuickSort(arr, low, q-1);
		QuickSort(arr, low+1, high);
		
		}
	}
	private static int Median3(int[] arr, int low, int i, int high) {
		
		int M = (low + high)/2;
		if(arr[low] >arr[M])
			exchange(low, M);
		if(arr[low] > arr[high] )
			exchange(low, high);
		if(arr[M] >arr[high])
			exchange(M,high);
		
		exchange(M, high-1);

		return arr[high-1];
	}
	private static void InsertionSort(int[] arr, int low, int high) {
		
				int length =arr.length;
				for  (int j = 1; j < length; j++){
					int k = arr[j];
					int i = j -1;
					while ((i >= 0) && (arr[i] > k)){
						arr[i+1] = arr[i];
						i = i -1;
						arr[i+1] = k;
					
			}
		}
	}
}
