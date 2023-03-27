package chapter7.gradeBook;

public class GradeBookTest {
    public static void main(String[] args) {
        int[] scores = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook studentGradeBook = new GradeBook(scores, "CS101 Introduction to Java Programming");
        System.out.println("Welcome to grade book for \n" + studentGradeBook.getCourseName());

        studentGradeBook.processGrade();
    }
}
