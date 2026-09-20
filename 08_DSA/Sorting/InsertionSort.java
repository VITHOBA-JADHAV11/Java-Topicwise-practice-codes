/**
 * Problem: InsertionSort
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[]a={5,1,4,2};for(int i=1;i<a.length;i++){int x=a[i],j=i-1;while(j>=0&&a[j]>x){a[j+1]=a[j];j--;}a[j+1]=x;}System.out.println(java.util.Arrays.toString(a));
    }
}
