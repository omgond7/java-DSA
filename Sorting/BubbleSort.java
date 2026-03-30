package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        arr= BubbleSorting(arr);
        display(arr);       
    }
public static int[] BubbleSorting(int[] arr){
    for(int i = arr.length - 1; i >= 0; i--) {

        boolean swapped = false;

        for(int j = 0; j < i; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }

        if(!swapped) break; 
    }
    return arr;
}
    public static void display(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
}
