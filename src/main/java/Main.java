package main.java;

/**
 * Created by Pepa on 6/30/2016.
 */
public class Main {
    public static void main(String[] args) {
        for (String s : args) {
            if(checkPalindrome(s.toCharArray())){
                System.out.println(s + " is a palindrome");
            } else {

            }
        }
    }
    public static boolean checkPalindrome(char[] charArray) {
        for(int i = 0 ; i <charArray.length/2 ; i++){
            if(charArray[i] != charArray[charArray.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
