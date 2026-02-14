import java.util.Scanner;

public class pratice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// store 5 arrays each with 5 IDs (total 25 entries)
		int[][] ids = new int[5][5];

		// read 5 arrays of 5 integers from user
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter 5 IDs for array " + (i + 1) + " (separated by spaces):");
			for (int j = 0; j < 5; j++) {
				ids[i][j] = sc.nextInt();
			}
		}

		// ask which ID to find
		System.out.println("Enter ID to find:");
		int target = sc.nextInt();

		// iterate through all arrays and report positions (1-based)
		boolean found = false;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (ids[i][j] == target) {
					System.out.println("Found in array " + (i + 1) + " position " + (j + 1));
					found = true;
				}
			}
		}

		if (!found) {
			System.out.println("ID not found.");
		}

		sc.close();
	}
}
