package chapter7.multiGradeBook;

public class MultiGradeBook {
    private int[][] grades;
    private String courseName;

    public MultiGradeBook(int[][] listOfGrades, String nameOfCourse) {
        this.grades = listOfGrades;
        this.courseName = nameOfCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrade() {
        outputGrade();
        System.out.printf("%n%s %d%n%s %d%n%n ",
                "The lowest score in the test is", getMinimumScore(),
                "The highest score in the test is", getMaximumScore());

        outputBar();
    }

    public int getMinimumScore() {
        int lowestGrade = grades[0][0];
        for (int[] grade : grades) {
            for (int score : grade) {
                if (score < lowestGrade){
                    lowestGrade = score;
                }
            }
        }
        return lowestGrade;
    }

    public int getMaximumScore() {
        int highestGrade = grades[0][0];
        for (int[] grade : grades) {
            for (int score : grade) {
                if (score > highestGrade){
                    highestGrade = score;
                }
            }
        }
        return highestGrade;
    }
    public double getAverage(int[] listOfScores){
        int total = 0;
        for(int grade: listOfScores){
            total+= grade;
        }
        return (double) total / listOfScores.length;
    }
    public void outputBar(){
        int[] frequency = new int[11];
        for(int[] gradeList : grades){
            for (int grade : gradeList){
                ++frequency[grade / 10];
            }
        }
        for (int count = 0; count < frequency.length; count++){
            if (count == 10){
                System.out.printf("%5d: ", 100);
            }
            else{
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for (int star = 0; star < frequency[count]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void outputGrade(){
        System.out.println("The grades are: \n\n");
        System.out.print("              ");

        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test + 1);
        }
        System.out.println(" Average");
        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d", student + 1);
            for(int test :grades[student] ){
                System.out.printf("%8d ", test);
            }
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }

}