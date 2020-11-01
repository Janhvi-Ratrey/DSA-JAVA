//Program to find minimum and maximum element of an array with minimum comparisons 
 //     If n is odd:    3*(n-1)/2  
//If n is even:   1 + 3*(n-2)/2 = 3n/2 -2 and O(n) time complexity.

public class MinAndMaxInArray {
public static void main(String[] args) {
	int arr[] = {30, 78, 56, 12, 55, 4, 32};
	int n = arr.length;
	int min, max, i;
	if(n%2==0){
		if(arr[0]<arr[1]){
			min=arr[0];
			max=arr[1];
		}
		else{
			min=arr[1];
			max=arr[0];
		}
		i=2;
	}
	else{
		min=arr[0];
		max=arr[0];
		i=1;
	}
	while(i<n-1){
		if(arr[i]>arr[i+1]){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i+1]<min){
				min=arr[i+1];
			}
		}
		else{
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i+1]>max){
				max=arr[i+1];
			}
		}
		i+=2;
	}
	
	System.out.println("Max "+max+" Min "+min);
}
}
//Output:
//Max 78 Min 4
