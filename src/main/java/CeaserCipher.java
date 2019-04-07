
public class CeaserCipher {
    public static String isEncrypt(String text, int shift) {
//        String output = new String();
        String encryptedOutput = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char x = (char) (ch + shift);

                if (x > 'z') {
                    encryptedOutput += (char) (ch - (26 - shift));

                } else {
                    encryptedOutput += x;
                }
            }
        }
        return encryptedOutput;
    }
}