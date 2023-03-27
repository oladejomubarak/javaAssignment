package chapter7.multiGradeBook;

public class MultiGradeBookTest {
    public static void main(String[] args) {
        int[][] gradeArray = {{87, 96, 70},
                             {68, 87, 90},
                             {94, 100, 90},
                             {100, 81, 82},
                             {83, 65, 85},
                             {78, 87, 65},
                             {85, 75, 83},
                             {91, 94, 100},
                             {76, 72, 84},
                             {87, 93, 73}};
        MultiGradeBook myGradeBook = new MultiGradeBook(gradeArray, "CSS 101- Computer Science");
        System.out.printf("Welcome to grade book for %n%s%n", myGradeBook.getCourseName());
        myGradeBook.processGrade();
    }
}
