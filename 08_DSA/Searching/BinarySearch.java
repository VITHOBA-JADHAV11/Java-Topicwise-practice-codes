/**
 * Problem: BinarySearch
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[]a={1,3,5,7,9};int t=7,l=0,r=a.length-1;while(l<=r){int m=(l+r)/2;if(a[m]==t){System.out.println(m);break;}if(a[m]<t)l=m+1;else r=m-1;}
    }
}
