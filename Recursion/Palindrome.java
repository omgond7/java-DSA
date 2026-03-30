package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        String s1 ="abcba";
        if(checkIfPalindrome(s1,0,s1.length()-1)){
            System.out.print("String is palindrome");
        }
        else{
            System.out.print("Not a plaindrome");
        }

    }
    public static boolean checkIfPalindrome(String s1,int left,int right){
        if(s1==null) throw new IllegalArgumentException();
        if(left>=right){
            return true;
        }
        if(s1.charAt(left)==s1.charAt(right)){
            return checkIfPalindrome(s1, left + 1, right -1);
        }
        return false;
    }
}
