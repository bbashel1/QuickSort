import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



public class Driver {
	public static void main (String[] args) {
		int[]A = new int[100];
		int lo = 0;
		int hi = A.length-1;

		try {
			Scanner scan = new Scanner( new File("input_100.txt"));
			int n = 0;
			while(scan.hasNext()){
				A[n++] = scan.nextInt();
			}
			scan.close();
//			System.out.println("Unsorted:" + Arrays.toString(arr));
//			Quicksort.sort(arr,low,high);
			//System.out.println("Using quick sort only: " + Arrays.toString(arr));
			
			QuickSort.medianQuickSort(A, lo, hi);
			System.out.println ("Using Median3 algorithm: " + Arrays.toString(A));
			long endTime = System.currentTimeMillis();
			//System.out.println("it took " + (endTime - startTime) + " milliseconds");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
	}

}
