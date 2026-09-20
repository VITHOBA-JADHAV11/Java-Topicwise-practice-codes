/**
 * Problem: RemoveDuplicates
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s="programming";System.out.println(s.chars().distinct().collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append));
    }
}
