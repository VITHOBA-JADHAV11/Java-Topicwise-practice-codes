/**
 * Problem: AnagramChecker
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class AnagramChecker {
    public static void main(String[] args) {
        String a="listen",b="silent";char[]x=a.toCharArray(),y=b.toCharArray();java.util.Arrays.sort(x);java.util.Arrays.sort(y);System.out.println(java.util.Arrays.equals(x,y));
    }
}
