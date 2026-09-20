/**
 * Problem: MoveZeros
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] a={0,1,0,3,12};int p=0;for(int x:a)if(x!=0)a[p++]=x;while(p<a.length)a[p++]=0;System.out.println(java.util.Arrays.toString(a));
    }
}
