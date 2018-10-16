package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rows;
		int columns;
		
		System.out.println("Enter the number of rows");		
		rows = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		columns = sc.nextInt();
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=columns; j++) {
				if (j%2==0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
