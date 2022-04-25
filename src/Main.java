

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


import static details.Decode.*;
import static details.Encode.encrypt;

public class Main {
    public ArrayList<String> encodeWords(String encodeCheck) {
        ArrayList<String> check = new ArrayList<String>();
        check.add("andy");

        return check;
    }



    public ArrayList<String> decodeWords(String decodeCheck) {
        ArrayList<String> check2 = new ArrayList<String>();
        check2.add("harry");
                return check2;
    }

    public static void main(String[] args) throws Exception {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(is);
        System.out.println("enter text to encrypt");
        String text = br.readLine();
        System.out.println("enter encryption key");
        int key = Integer.parseInt(br.readLine());
//encrypt
        System.out.println("Plain Text:\n"+text );
        String cipher = encrypt(text,key);
        System.out.println("Cipher Text:\n"+cipher);
//        decrypt
        System.out.println("Cipher Text:\n" + text );
        text =decrypt(cipher,key);
        System.out.println("Plain Text:\n"+text);

    }
}


