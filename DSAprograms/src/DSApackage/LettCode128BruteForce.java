package DSApackage;
//method2 also there using sorting technique
class LettCode128BruteForce {
    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        
        int maxLength = 0;
        int start = -1;
        int end = -1;
        for(int i=0;i<arr.length;i++) {
            int length = 1;
            int next = arr[i]+1;
            boolean found = true;
            while(found == true) {
                found = false;
                for(int j=0;j<arr.length;j++) {
                    if(next==arr[j]) {
                        found = true;
                        next++;
                        length++;
                        break;
                    }
                }
                
                maxLength = Math.max(length,maxLength);
                // if(found==false) {
                //     found = false;
                //     break;
                // }
            }
        }
        
        System.out.println(maxLength);
        
    }
}