
public class sort {
    public static void main(String[] args) {

        int []arr = {4,6,1,3,2,5,9};
        quicksort(0, arr.length-1 , arr);
        System.out.println("Sorted array: ");
        printArray(arr, arr.length);

    }
    private static void quicksort(int l, int h, int []arr){
        if(l < h){
            int pivot = partition(l,h,arr);
            quicksort(l, pivot-1, arr);
            quicksort(pivot+1, h, arr);
        }

    }
    private static int partition(int l, int h, int []arr){//l --> first index // h --> last index
        int pivot = arr[(l+h)/2];
        int i = l;
        int j = h;

        while( i < j ){
            while(arr[i] <= pivot) i++ ;
            while (arr[j] > pivot) j-- ;
            if(i < j)
                swap(i,j,arr);
        }
        swap(j, l,arr);
        return j;
    }

    private static void swap(int i, int j,int []arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
