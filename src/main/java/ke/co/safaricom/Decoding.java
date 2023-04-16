package ke.co.safaricom;

public class Decoding {
    public static final String decodeAlphabets = "XYZABCDEFGHIJKLMNOPQRSTUVW";

    public static String decode(String msg, int key){
        StringBuilder output = new StringBuilder();
        for(char c: msg.toCharArray()){
            int charPos = decodeAlphabets.indexOf(c);
            if (charPos == -1){
                output.append(c);
                continue;
            }
            int tempNewPos = charPos + key;
            int newPos = tempNewPos > 25 ?  tempNewPos % 26 : tempNewPos;
            char replacement = decodeAlphabets.charAt(newPos);
            output.append(replacement);
        }
        return output.toString();
    }
}