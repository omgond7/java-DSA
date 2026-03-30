package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        arr= selectionSorting(arr);
        display(arr);
    }
    public static int[] selectionSorting(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void display(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
    }
}
