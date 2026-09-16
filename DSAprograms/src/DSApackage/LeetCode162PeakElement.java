package DSApackage;

public class LeetCode162PeakElement {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,3,1};

        int n = arr1.length;
        if(arr1[0]>arr1[1]) {
            System.out.println("peak element is "+ arr1[0]);
        }else if(arr1[n-1]>arr1[n-2]) {
            System.out.println("peak element is "+ arr1[n-1]);
        } else {
            for(int i=1;i<arr1.length-1;i++) {
                if(arr1[i]>arr1[i-1]&&arr1[i]>arr1[i+1]) {
                    System.out.println("peak element is "+ arr1[i]);
                }
            }
        }
    }
}
