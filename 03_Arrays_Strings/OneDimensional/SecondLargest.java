/**
 * Problem: SecondLargest
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class SecondLargest {
    public static void main(String[] args) {
        int[] a={4,9,2,7};int f=Integer.MIN_VALUE,s=f;for(int x:a){if(x>f){s=f;f=x;}else if(x>s&&x!=f)s=x;}System.out.println(s);
    }
}
