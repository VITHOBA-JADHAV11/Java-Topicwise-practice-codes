/**
 * Problem: LCM
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class LCM {
    public static void main(String[] args) {
        int a=12,b=18,x=a,y=b; while(y!=0){int t=x%y;x=y;y=t;} System.out.println(a/x*b);
    }
}
