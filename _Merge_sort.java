class MergeSort 
{
   
void merge(int arr[], int l, int mid, int r)
    {
         int i = l;
         int j = mid+1;
         int k = l ;
         int b [] = new int[];
         while(i <= mid && j <= r){
             if(arr[i] < arr[j]){
                 b[k] = arr[i];
                 i++;
             }else{
                 b[k] = arr[j];
                 j++;
             }
             k++;
         }
         if(i > mid ){
             while(j <= r){
                 b[k] = arr[j];
                 k++;
                 j++;
             }
         }else{
             while(i <= mid){
                 b[k] = arr[i];
                 i++;
                 k++;
             }
         }
         for(k = l; k<= r; k++){
             a[k] = b[k];
         }
         b = null;
    }
  
    void mergeSort(int arr[], int l, int r)
    {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(arr, l mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
     }
  }

static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
  
        System.out.println("Given Array");
        printArray(arr);
  
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);
  
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
