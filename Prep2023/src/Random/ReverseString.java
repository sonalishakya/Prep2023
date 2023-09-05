package Random;

import java.util.Arrays;

/**
 * @author: sonali.shakya
 */
public class ReverseString {
    public static void main(String[] args) {
//        Input Test Cases
        String str = "Hey, there!";
//        String str = "";
//        String str = null;
//        String str = "S";

        //new string variable - O(n)
        System.out.println(newString(str));
    }

    static String newString(String str) {
        if (str != null) {
            String revString = "";
            int size = str.length()-1;
            switch (size) {
                case -1 : return "Empty string provided";
                case 0 : return str;
                default : {
                    while (size >= 0) {
                        revString = revString + str.charAt(size);
                        size--;
                    }
                    return revString;
                }
            }
        }
        return "Null string provided";
    }
}
