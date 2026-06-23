package DSApackage;

public class CompressData {

	public static void main(String[] args) {
		String str = "aaabbccc";
		char char1[] = str.toCharArray();
		boolean visited[] = new boolean[str.length()];
		
		for(int i=0;i<char1.length;i++) {
			if(visited[i]) {
				continue;
			} else {
			char c1 = str.charAt(i);
			int count = 0;
			boolean isNew = false;
			for(int j=i;j<char1.length;j++) {
			    if(char1[i]==char1[j]){
					count++;
					visited[j]=true;
					isNew = true;
				}
			}
			
			System.out.print(c1);
			System.out.print(count);
			
		}
		}
		

	}

}
