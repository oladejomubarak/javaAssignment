package chapter7.gradeBook;

public class GradeBook {
    private int[] grades;
    private String courseName;

    public GradeBook (int[] grades, String courseName){
        this.grades = grades;
        this.courseName = courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrade(){
        outputGrades();

        System.out.printf("The average score is %.2f%n", getAverage());

        System.out.printf("The lowest score is %d%n", getMinimum());

        System.out.printf("The highest score is %d%n", getMaximum());

        outputBar();
    }

    public void outputGrades(){
        System.out.printf("The grades are: %n%n");
        for (int grade = 0; grade < grades.length; grade++){
            System.out.printf("student %2d:  %3d%n", grade + 1, grades[grade]);
        }
    }
    public double getAverage(){
        int total = 0;
        double average = 0;
        for (int grade = 0; grade < grades.length; grade++){
            total += grades[grade];
             average = (double) total / grades.length;
        }
       return average;
    }
    public int getMinimum(){
        int minimumScore = grades[0];
        for (int score = 0; score < grades.length; score++){
            if ( grades[score] < minimumScore) minimumScore = grades[score];
        }
        return minimumScore;
    }
    public int getMaximum(){
        int maximumScore = grades[0];
        for (int score = 0; score < grades.length; score++){
            if (grades[score] > maximumScore) maximumScore = grades[score];
        }
        return maximumScore;
    }
    public void outputBar(){
        System.out.println("Grade Distribution:");
        int[] frequency = new int[11];
        for (int grade : grades){
            ++frequency[grade / 10 ];
        }
        for (int count = 0; count < frequency.length; count++) {
            if (count == 10){
                System.out.printf("%5d: ", 100);
            }
            else{
                System.out.printf("%02d-%02d:", count * 10, count * 10 + 9);
            }
            for (int star = 0; star < frequency[count]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
