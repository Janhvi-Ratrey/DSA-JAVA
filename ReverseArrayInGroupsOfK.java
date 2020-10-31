//Program to reverse an array in groups of K elements in O(n) time complexity.
public class ReverseArrayInGroupsOfK {
  
	public static void main(String args[]){
	
		int arr[] = {67, 90, 43, 77, 23, 66, 14, 4, 89, 11, 44};
		int n = arr.length;
		int k=4;
		
		System.out.println("Given array: ");
		for(int i=0; i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<n; i=i+k){
			int start =i;
			int end = Math.min(i+k-1, n-1);
			
			while(start<end){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		
		System.out.println("Reversed array: ");
		for(int i=0; i<n;i++){
			System.out.print(arr[i]+" ");
		}
    }
}


//Output:
//Given array: 
//67 90 43 77 23 66 14 4 89 11 44 
//Reversed array: 
//77 43 90 67 4 14 66 23 44 11 89