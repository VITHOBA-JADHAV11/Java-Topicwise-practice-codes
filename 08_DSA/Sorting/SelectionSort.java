/**
 * Problem: SelectionSort
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[]a={5,1,4,2};for(int i=0;i<a.length;i++){int k=i;for(int j=i+1;j<a.length;j++)if(a[j]<a[k])k=j;int t=a[i];a[i]=a[k];a[k]=t;}System.out.println(java.util.Arrays.toString(a));
    }
}
