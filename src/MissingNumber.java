
public class MissingNumber {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6};
		
		int n = 6;
		
		int actulsum =  n*(n+1) / 2; 
		
		int exceptedsum = 0; 
		
		
		for(int i = 0 ; i<arr.length; i++) {
			
			exceptedsum = exceptedsum+arr[i];
			
			
			
			
		}
		
		
		int missingnumber = actulsum - exceptedsum ;
		System.out.println(missingnumber);
		
		
		
		
	}

}
