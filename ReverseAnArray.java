//Program to reverse an array in O(n) time complexity.

public class ReverseAnArray {
public static void main(String rgs[]){
	int arr[]={1, 89, 90, 67, 77, 44, 34, 56, 23, 21, 11, 4};
	int n =arr.length;
	System.out.println("Given array: ");
	
	for(int i=0; i<n;i++){
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
	int index1=0, index2=n-1;
	while(index1<index2){
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		index1++;
		index2--;
	}
	
	System.out.println("Reversed array: ");
	
	for(int i=0; i<n;i++){
		System.out.print(arr[i]+" ");
	}
}
}
