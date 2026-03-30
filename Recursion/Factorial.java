package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.print(factorial(10));

    }
    public static int factorial(int n){
        if(n<0) throw new IllegalArgumentException();
        if(n==1 || n==0)return 1;
        return n *factorial(n-1);
    }
}
//Afvance
// import java.math.BigInteger;

// //public static BigInteger factorial(int n) {
//     if (n < 0) {
//         throw new IllegalArgumentException("Factorial not defined for negative numbers");
//     }
//     if (n == 0 || n == 1) {
//         return BigInteger.ONE;
//     }
//     return BigInteger.valueOf(n).multiply(factorial(n - 1));
// }


//Optimized
// public static long factorial(int n) {
//     if (n < 0) {
//         throw new IllegalArgumentException("Factorial not defined for negative numbers");
//     }
//     long result = 1;
//     for (int i = 2; i <= n; i++) {
//         result *= i;
//     }
//     return result;
// }
