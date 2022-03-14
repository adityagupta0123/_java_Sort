package Arrays;
import.java.util.Scanner;
public class SelectionSort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

//         int a[]={1,-3,5,-11,-5,22};
        
        int n=sc.nextInt();
        int arr = new Int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt[]; 
        }

        for (int i=0; i<n-1; i++){

            int minInd=i;
            for(int j=i; j<n; j++){

                if(a[j] < a[minInd]){
                    minInd = j;
                }
            }
            int temp=a[i];
            a[i]=a[minInd];
            a[minInd]=temp;
        }

        for(int item: a ){
            System.out.print(item+" ");
        }
    }
}
