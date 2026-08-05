

class MaxConsecutiveNumbers {
    public static void main(String[] args) {
        int arr[] = {100,1,200,2,3,4}; 
        
        int maxLength = 0;
        for(int i=0;i<arr.length;i++) {
            int next = arr[i]+1;
            boolean found = true;
            int length = 1;
            while(found==true) {
                found = false;
                for(int j=0;j<arr.length;j++) {
                    if(arr[j]==next) {
                        next++;
                        length++;
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    found = false;
                }
                maxLength = Math.max(maxLength,length);
            }
        }
        System.out.println(maxLength);
    }
}