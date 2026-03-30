package Recursion;

public class PrintOneToN {
   public static void main(String[] args) {
        int n=10;
        display(n);
   }
   public static void display(int n){
        if(n==0) return ;
        display(n-1);
        System.err.println(n);
   }
}

