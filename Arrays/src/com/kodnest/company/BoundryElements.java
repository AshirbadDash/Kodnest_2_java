package com.kodnest.company;
//// JAVA Code for Boundary elements of a Matrix

//
//public class BorderElementsArray {
//
//	public static void printBoundary(int a[][], int m, int n) {
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				if (i == 0)
//					System.out.print(a[i][j] + " ");
//				else if (i == m - 1)
//					System.out.print(a[i][j] + " ");
//				else if (j == 0)
//					System.out.print(a[i][j] + " ");
//				else if (j == n - 1)
//					System.out.print(a[i][j] + " ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println("");
//		}
//	}
//
//	public static void main(String[] args) {
//		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
//
//		// Function call
//		printBoundary(a, 4, 4);
//	}
//}
// Boundry Elements of the Matrix 

public class BoundryElements {

	public void Boundary_Elements(int mat[][]) {
		// Printing Input Matrix;
		System.out.println("Input Matrix is : ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j]);
			}

			System.out.println();
		}

		// Printing Boundary Values of Matrix
		System.out.println("Resultant Matrix is :");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (i == 0 || j == 0 || i == mat.length - 1 || j == mat[i].length - 1) {
					System.out.print(mat[i][j]);
				} else {
					// Printing Space if element
					// is not at Boundary
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Input Matrix
		int mat[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		BoundryElements B_Values = new BoundryElements();

		B_Values.Boundary_Elements(mat);
	}
}