public class Main
{
	public static void main(String[] args) {
		int arr [] ={7,9,3,6,32,5};
		int n = arr.length;
		for(int i=1; i<n; i++){
		    int temp = arr[i];
		    int j = i-1;
		    while(j>=0 && arr[j]>temp){ 
		        arr[j+1] = arr[j];
		        j--;
		    }
		    arr[j+1] = temp;
		}
		for(int x : arr){ //for each loop
		    System.out.print(x +" ");
		}
	}
}
