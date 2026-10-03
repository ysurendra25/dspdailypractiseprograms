package DSApackage;

public class MinimumDistanceToHouses {

	// input1[i] = start of house i, input2[i] = length of house i.
	// House i covers the segment [input1[i], input1[i] + input2[i]].
	// For each value in input3, measure the distance to the nearest house
	// (0 if the value lies inside one), then print the total.
	// Time: O(queries * houses)   Extra space: O(1)

	public static void main(String[] args) {
		int[] input1 = {6, 3, 9, 19, 25};
		int[] input2 = {2, 2, 4, 6, 1};
		int[] input3 = {5, 9, 6, 18, 11, 24, 20};

		int total = 0;
		for (int value : input3) {
			int dist = findDistance(value, input1, input2);
			if (dist == -1) continue;
			total = total + dist;
		}

		System.out.println(total); // prints 1
	}

	public static int findDistance(int value, int[] input1, int[] input2) {
		int distance = Integer.MAX_VALUE;
		for (int i = 0; i < input1.length; i++) {
			int LastHousePoint = input1[i] + input2[i];
			if (value >= input1[i] && value <= LastHousePoint) {
				return 0;
			}
			int leftDistance = Math.abs(value - input1[i]);
			int rightDistance = Math.abs(value - LastHousePoint);
			int min = Math.min(leftDistance, rightDistance);
			distance = Math.min(distance, min);
		}
		return distance == Integer.MAX_VALUE ? -1 : distance;
	}
}
