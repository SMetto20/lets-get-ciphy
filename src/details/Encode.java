package details;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Encode {
    public static String encrypt(String text, int key ) {
        String cipher = " ";
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (Character.isUpperCase(letter)) {
                int x = letter - 'A' + key;

                x %= 26;

                letter = (char) (x + 'A');

            }else if (Character.isLowerCase(letter)){
                int x = letter - 'a' + key;

                x%=26;

                letter= (char) (x + 'a');

            }
            cipher+= letter;
        }
        return cipher;
    }

}


