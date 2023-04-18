package ke.co.safaricom;
public class Encoding {
    private static final String alphabets = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt (String msg, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();
        msg = msg.toUpperCase();
        for (int i = 0; i< msg.length(); i++)
        { char c = msg.charAt(i);
            if( Character.isLetter(c))
            {
                c =(char) ((c - 'a'+ shift + 26)% 26 + 'a');
            }
            encryptedMessage.append(c);
    }
        return encryptedMessage.toString();
    }
}
