import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Driver {
	private static long startTime = System.currentTimeMillis();
	public static void main (String[] args) {
			int[]arr = new int[16];
			int low = 0;
			int high = arr.length-1;

			try {
				Scanner scan = new Scanner( new File("input_16.txt"));
				int n = 0;
				while(scan.hasNext()){
					arr[n++] = scan.nextInt();
				}
				scan.close();
//				System.out.println("Unsorted:" + Arrays.toString(arr));
//				Quicksort.sort(arr,low,high);
				//System.out.println("Using quick sort only: " + Arrays.toString(arr));
				
				Quicksort.QuickSort(arr, low, high);
				System.out.println ("Using Median3 algorithm: " + Arrays.toString(arr));
				long endTime = System.currentTimeMillis();
				System.out.println("it took " + (endTime - startTime) + " milliseconds");
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}	
		}
		
	}

