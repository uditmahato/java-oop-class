public class EncryptionDecryption {
   public static String text="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~ \t\n\r x0b x0c";
    public static void encryption(String plainText, int key) {
        // Do looping of each charter and encode
        for(int i=0; i<plainText.length(); i++) {
            char chr = plainText.charAt(i);
            int index = text.indexOf((chr));
            int newIndex = index + key % text.length();
            char cipherChar = text.charAt(newIndex);
            System.out.print(cipherChar);
        }
    }


    public static void decryption(String plainText, int key) {
        // Do looping of each charter and encode
        for(int i=0; i<plainText.length(); i++) {
            char chr = plainText.charAt(i);
            int index = text.indexOf((chr));
            int newIndex = index - key % text.length();
            char cipherChar = text.charAt(newIndex);
            System.out.print(cipherChar);
        }
    }


    public static void main(String[] args) {


       encryption("hello",3);
       decryption("khoor",3);
    }
}

