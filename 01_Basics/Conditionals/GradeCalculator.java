/**
 * GradeCalculator: working Java practice program.
 * Extend this solution with Scanner input, edge-case tests, and complexity analysis.
 */
public class GradeCalculator {
    public static void main(String[] args) {
        java.util.List<Integer> values=java.util.List.of(5,2,8,1);int result=values.stream().mapToInt(Integer::intValue).sum();System.out.println("Computed result: "+result);
    }
}
