package array;



public class FindMaximumInArray {
		
		public   int maximumelement(int number []) {
			
			int max = Integer.MIN_VALUE;
			
			for(int i = 0 ; i<number.length;i++) {
				
				if(number[i] > max) {
					max = number[i];
				}
			}
			
			return max ;
			
		}
		
		
		
		public static void main(String [] args) {
			
			FindMaximumInArray  fm = new FindMaximumInArray ();
			
			int [] numbers = {1,2,3,4,5,6};
			
			System.out.println(fm.maximumelement(numbers));
		}
	
	

}
