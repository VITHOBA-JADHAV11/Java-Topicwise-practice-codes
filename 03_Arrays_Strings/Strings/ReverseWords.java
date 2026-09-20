/**
 * Problem: ReverseWords
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class ReverseWords {
    public static void main(String[] args) {
        String s="Java is powerful";String[] w=s.split(" ");for(int i=w.length-1;i>=0;i--)System.out.print(w[i]+" ");
    }
}
