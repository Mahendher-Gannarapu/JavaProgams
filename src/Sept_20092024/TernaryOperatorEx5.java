/*
Write the grade program in ternary operator
String grade = (mark >= 90) ? “A” : (mark >= 80) ? “B” : “C”;
 */
package Sept_20092024;

public class TernaryOperatorEx5 {
    public static void main(String[] args) {
        int marks = 40;
        char A, B, C;
        String grade = (marks>=90) ? "A" : (marks>=70 && marks<=89) ? "B" : (marks>=50 && marks<=69) ? "C" : "FAIL";
        System.out.println(grade);
    }
}
