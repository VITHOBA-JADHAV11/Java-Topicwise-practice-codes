/**
 * Problem: PerfectNumber
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int n=28,sum=0; for(int i=1;i<n;i++)if(n%i==0)sum+=i; System.out.println(sum==n);
    }
}
