package details;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Encode {
    String[] alphabets = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


    public static void main(String[] args) throws Exception {
        List<String> alphabets = new ArrayList<>();
        System.out.println("Kindly enter a phrase");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(is);

        String phrase = br.readLine();
        System.out.println(phrase);
    }

}


