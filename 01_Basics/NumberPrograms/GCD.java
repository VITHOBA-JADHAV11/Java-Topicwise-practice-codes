/**
 * Problem: GCD
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class GCD {
    public static void main(String[] args) {
        int a=48,b=18; while(b!=0){int t=a%b;a=b;b=t;} System.out.println(a);
    }
}
