
public class MissingNumber {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6};
		
		int n = 6;
		
		int exceptedsum =  n*(n+1) / 2; 
		
		int actualsum = 0; 
		
		
		for(int i = 0 ; i<arr.length; i++) {
			
			actualsum= actualsum+arr[i];
			
			
			
			
		}
		
		
		int missingnumber =  exceptedsum - actualsum ;
		System.out.println(missingnumber);
		
		
		
		
	}

}
