package Arrays;

public class SelectionSort {
    public static void main(String[]args){

        int a[]={1,-3,5,-11,-5,22};
        int n=a.length;

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
