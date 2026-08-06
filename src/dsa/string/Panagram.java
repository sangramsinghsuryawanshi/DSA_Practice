package dsa.string;

import java.util.Locale;

public class Panagram {
    public static void main(String[] args) {
        String s = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(isPana(s)+""+s.length());
    }

    private static boolean isPana(String s) {
        s=s.toLowerCase();
        if(s.length()<26){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            boolean ispana=false;
            for (int j = 97; j <= 122; j++) {
                if ((int) s.charAt(i) == j) {
                    ispana=true;
                    break;
                }
            }
            if(!ispana){
                return false;
            }
        }
        return true;
    }
}
