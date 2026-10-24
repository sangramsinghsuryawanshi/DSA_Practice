package dsa.string;

import java.util.*;

public class GroupLengthCount {
    public static void main(String[] args) {
        String s[] = {"dog", "cat", "rabbit", "zebra", "fox"};
        boolean b[] = new boolean[s.length];
        for(int i=0;i<s.length;i++){
            if(b[i]){
                continue;
            }
            int cnt=1;
            b[i] = true;
            for(int j=i+1;j<s.length;j++){
                if(!b[j] && s[i].length() == s[j].length()){
                    cnt++;
                    b[j] = true;
                }
            }
            System.out.println(
                    "Length " + s[i].length() + " = " + cnt + "{"+s[i]+"}"
            );
        }
    }

}
