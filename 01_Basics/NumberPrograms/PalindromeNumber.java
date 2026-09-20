/**
 * Problem: PalindromeNumber
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int n=121,x=n,r=0; while(x>0){r=r*10+x%10;x/=10;} System.out.println(n==r);
    }
}
