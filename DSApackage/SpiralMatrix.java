package DSApackage;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	// Walk the matrix in spiral order using four shrinking boundaries.
	// top, bottom, left, right describe the rectangle that is still unread.
	// Time: O(m*n)   Extra space: O(1)

	public static void main(String[] args) {
		int[][] mat = {
			{ 1,  2,  3,  4,  5},
			{ 6,  7,  8,  9, 10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		};

		System.out.println(findSpiralMatrix(mat));
	}

	public static List<Integer> findSpiralMatrix(int[][] mat) {

		List<Integer> l1 = new ArrayList<>();
		int left = 0;
		int right = mat[0].length - 1;
		int top = 0;
		int bottom = mat.length - 1;

		while (top <= bottom && left <= right) {
			// 1) top row: left -> right
			for (int i = left; i <= right; i++) {
				l1.add(mat[top][i]);
			}
			top++;

			// 2) right column: top -> bottom
			for (int i = top; i <= bottom; i++) {
				l1.add(mat[i][right]);
			}
			right--;

			// 3) bottom row: right -> left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					l1.add(mat[bottom][i]);
				}
			}
			bottom--;

			// 4) left column: bottom -> top
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					l1.add(mat[i][left]);
				}
			}
			left++;
		}

		return l1;
	}
}
