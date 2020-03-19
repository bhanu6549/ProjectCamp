import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of 1st 2D array");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the Size of 2nd Arrray");
		int n2 = sc.nextInt();
		if(n1==n2&&n1>0&&n2>0) {
		int arr2[][] = new int[n2][n2];
		int arr1[][] = new int[n1][n1];
		System.out.println("Enter the element of first array");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j] = sc.nextInt();

			}
		}
		
		
		
		System.out.println("Enter the element of 2nd Array");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr2[i][j] = sc.nextInt();

			}

		}
		System.out.println("First array");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j]+" ");

			}
			System.out.println();
		}
		System.out.println("Second Array");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j]+" ");

			}
			System.out.println();
		}
		int arr1d[] = new int[n1 + n2];
		while (true) {
			System.out.println("choose the option");
			System.out.println("1.Replace left Daigonal");
			System.out.println("2.sum of row ");
			System.out.println("3.replace even");
			System.out.println("4.Serach");
			System.out.println("5.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				replaceleft(arr1, arr2);
				break;
			case 2:
				arr1d = sumRow(arr1, arr2, arr1d);
				System.out.println("row sum");
				for (int i = 0; i < arr1d.length; i++) {
					System.out.println(arr1d[i]);

				}
				break;
			case 3:
				arr1d = replaceEven(arr1d);
				for (int i = 0; i < arr1d.length; i++) {
					System.out.print(arr1d[i] + " ");
				}
				break;
			case 4:
				int rt = binarySearch(arr1d);
				if (rt == -1) {
					System.out.println("element  not found");
				} else {
					System.out.println("elemnet  found at position "+rt);
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("pls choose corect option");
				

			}
		}}
		else
		{
			System.out.println("Pls enter of same size and postive size");
		}

	}

	private static int binarySearch(int[] arr1d) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search");
		int temp = sc.nextInt();
		arr1d = insertionSort(arr1d);
		/*
		 * for (int i = 0; i < arr1d.length; i++) { System.out.println(arr1d[i]+" "); }
		 */
		int l = 0;
		int u = arr1d.length - 1;
		int mid = (l + u) / 2;
		while (l <= u) {
			if (temp == arr1d[mid])
				return mid;
			else if (arr1d[mid] < temp)
				l = mid + 1;
			else
				u = mid - 1;
			mid = (l + u) / 2;
			
		}

		return -1;

	}

	static int[] insertionSort(int[] arr1d) {
		int i=1;
		while(i<arr1d.length) {
		
			int val = arr1d[i];
			int j = i - 1;
			while (j >= 0 && arr1d[j] > val) {
				arr1d[j + 1] = arr1d[j];
				j--;

			}
			arr1d[j + 1] = val;
			i++;
		}
		return arr1d;

	}

	private static int[] replaceEven(int[] arr1d) {
		for (int i = 0; i < arr1d.length; i++) {
			if (arr1d[i] % 2 == 0) {
				arr1d[i] = -1;
			}

		}
		return arr1d;

	}

	private static int[] sumRow(int[][] arr1, int[][] arr2, int[] arr1d) {
		int sum = 0;
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = 0;
			for (int j = 0; j < arr1.length; j++) {
				sum = sum + arr1[i][j];

			}
			arr1d[k++] = sum;

		}
		for (int i = 0; i < arr1.length; i++) {
			sum = 0;

			for (int j = 0; j < arr1.length; j++) {
				sum = sum + arr2[i][j];

			}
			arr1d[k++] = sum;

		}

		return arr1d;

	}

	private static void replaceleft(int[][] arr1, int[][] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (i==j) {
					int temp = arr1[i][j];
					arr1[i][j] = arr2[i][j];
					arr2[i][j] = temp;
				}

			}

		}
		System.out.println("After Swap");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + " ");

			}
			System.out.println();

		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();

		}

	}

}
