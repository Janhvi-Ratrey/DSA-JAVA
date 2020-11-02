
public class Segragate012 {

	public static void main(String[] args) {
		int arr[] = {0, 2, 0, 1, 2, 0, 2, 1};
		int low=0, mid=0, high=arr.length-1, temp;
		while(mid<=high){
			
			if(arr[mid]==0){
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			
			else if(arr[mid]==2){
				temp =arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
			
			else{
				mid++;
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}
