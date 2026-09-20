/**
 * Problem: CountVowels
 * Level: Easy/Mid/Hard progression
 * Includes: problem idea, executable solution, output practice and interview revision.
 * Complexity: Analyze the dominant loop/operation after running.
 * Interview practice: Explain the approach, edge cases, and possible optimization.
 */
public class CountVowels {
    public static void main(String[] args) {
        String s="education";long n=s.toLowerCase().chars().filter(x->"aeiou".indexOf(x)>=0).count();System.out.println(n);
    }
}
