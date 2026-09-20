/**
 * Problem: ValidParentheses
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s="({[]})";java.util.Deque<Character>d=new java.util.ArrayDeque<>();for(char ch:s.toCharArray()){if("([{".indexOf(ch)>=0)d.push(ch);else if(d.isEmpty()||"(){}[]".indexOf(ch)<0)d.push(ch);else{char o=d.pop();if(!((o=='('&&ch==')')||(o=='['&&ch==']')||(o=='{'&&ch=='}'))){System.out.println(false);return;}}}System.out.println(d.isEmpty());
    }
}
