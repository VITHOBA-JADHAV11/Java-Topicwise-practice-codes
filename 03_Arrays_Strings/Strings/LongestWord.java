/**
 * Problem: LongestWord
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class LongestWord {
    public static void main(String[] args) {
        String s="Java programming language";String best="";for(String w:s.split(" "))if(w.length()>best.length())best=w;System.out.println(best);
    }
}
