/**
 * Problem: BubbleSort
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[]a={5,1,4,2};for(int i=0;i<a.length;i++)for(int j=0;j<a.length-i-1;j++)if(a[j]>a[j+1]){int t=a[j];a[j]=a[j+1];a[j+1]=t;}System.out.println(java.util.Arrays.toString(a));
    }
}
