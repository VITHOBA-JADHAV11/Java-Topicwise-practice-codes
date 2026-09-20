/**
 * LargestOfThree: working Java practice program.
 * Extend this solution with Scanner input, edge-case tests, and complexity analysis.
 */
public class LargestOfThree {
    public static void main(String[] args) {
        int[] a={4,9,2,7}; int m=a[0]; for(int x:a)m=Math.max(m,x);System.out.println(m);
    }
}
