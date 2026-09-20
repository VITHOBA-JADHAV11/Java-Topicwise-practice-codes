/**
 * Problem: ArmstrongNumber
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153,x=n,sum=0; while(x>0){int d=x%10;sum+=d*d*d;x/=10;} System.out.println(n==sum);
    }
}
