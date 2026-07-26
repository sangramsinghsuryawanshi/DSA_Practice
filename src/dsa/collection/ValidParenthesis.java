package dsa.collection;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{}{()}";
        System.out.println(validPara(s));

    }
    private static boolean validPara(String s){
        Stack<Character> characterStack = new Stack<>();
        char ch [] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '{' || ch[i] == '[' || ch[i] == '('){
                characterStack.push(ch[i]);
            }else {
                if(characterStack.isEmpty()){
                    return false;
                }
                char top = characterStack.pop();
                if((ch[i] == ')' && top!='(') || (ch[i] == '}' && top!='{') || (ch[i] == ']' && top!='[')){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
