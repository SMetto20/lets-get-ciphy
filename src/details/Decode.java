package details;

public class Decode {
    public static String decrypt(String cipher, int key ){
        for (int i =0; i <cipher.length();i++ ) {
            char letter = cipher.charAt(i);
            if (Character.isUpperCase(letter)) {
                int x = letter - 'A' - key;
                if (x<0){
                    x += 26;}

                letter = (char) (x + 'A');

            }
    }

}
