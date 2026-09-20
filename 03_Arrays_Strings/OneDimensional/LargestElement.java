/**
 * Problem: LargestElement
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class LargestElement {
    public static void main(String[] args) {
        int[] a={4,9,2,7}; int m=a[0];for(int x:a)m=Math.max(m,x);System.out.println(m);
    }
}
