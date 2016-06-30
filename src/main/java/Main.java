package main.java;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.swing.text.StyleConstants;
import java.util.Arrays;

/**
 * Created by Pepa on 6/30/2016.
 */
public class Main {
    public static void main(String[] args) {
        for (String s : args) {
            if(checkPalindrome(s.toCharArray())){
                System.out.println(s + " is a palindrome");
            } else {
                System.out.println(getRevertedString(s.toCharArray()));
            }
        }
    }

    public static boolean checkPalindrome(char[] charArray) {
        for(int i = 0 ; i < (charArray.length/2)+1 ; i++){
            if(charArray[i] != charArray[charArray.length - 1 - i]){
                return false;
            }
        }
        return true;
    }

    public static String getRevertedString(char[] charArray) {
        char[] result = new char[charArray.length];
        for(int i = 0 ; i < (charArray.length/2)+1 ; i++) {
            result[i] = charArray[charArray.length-1-i];
            result[result.length-1-i] = charArray[i];
        }
        return new String(result);
    }
}
