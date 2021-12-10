package Arrays;

import java.util.Scanner;

public class Bubblesort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();
        int a[]= new int [n];
     
        for (int i=0; i<n-1; i++ ){
            for(int j=0; j<n-1-i; j++){

                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                     a[j+1]= a[j];
                     a[j]= temp;

                }
            }
        }
        for(int item:a){
            System.out.print(item+" ");
        }
    }
}
