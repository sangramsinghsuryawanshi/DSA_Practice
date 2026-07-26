package dsa.string;

public class Permutations {
    public static void main(String[] args) {
        permut("ABC","");
    }
    private static void permut(String per, String ans){
        if(per.isEmpty()){
            System.out.println(ans);
        }
        for (int i = 0; i < per.length(); i++) {
            char cur = per.charAt(i);
            String remain = per.substring(0,i) + per.substring(i+1);
            permut(remain,cur + ans);
        }
    }
}
