package Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        display(arr);
        reverseArray(arr,0,arr.length-1);
        display(arr);

    }
    public static void display(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    public static void reverseArray(int[] arr,int left,int right){
        if(arr == null || arr.length == 0) return;
        if(left>=right)return;
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseArray(arr, left+1, right-1);
    }
}
// 10 20 30 40 
//10 20 30 40 50