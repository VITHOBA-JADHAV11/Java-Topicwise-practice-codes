/**
 * Problem: HashMapFrequency
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class HashMapFrequency {
    public static void main(String[] args) {
        java.util.Map<String,Integer>m=new java.util.HashMap<>();for(String w:"java is java".split(" "))m.put(w,m.getOrDefault(w,0)+1);System.out.println(m);
    }
}
