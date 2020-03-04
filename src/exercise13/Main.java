package exercise13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] matrix = new double[input.nextInt()][input.nextInt()];
        System.out.println("Enter the array:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        Location maximum = locateLargest(matrix);
        System.out.println("The location of the largest element is " + maximum.maxValue + " at (" + maximum.row + ", " + maximum.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location largest = new Location();
        int largestI = 0;
        int largestJ = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[largestI][largestJ] < a[i][j]) {
                    largestI = i;
                    largestJ = j;
                }
            }
        }
        largest.row = largestI;
        largest.column = largestJ;
        largest.maxValue = a[largestI][largestJ];
        return largest;
    }
}
