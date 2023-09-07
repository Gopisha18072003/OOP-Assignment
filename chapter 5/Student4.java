import java.util.Scanner;

public class Student4 {
    private String name;
    private double totalScore;
    private int numberOfQuizzes;

    public Student4(String name, double score) {
        this.name = name;
        this.totalScore = score;
        this.numberOfQuizzes = 1;
    }

    public Student4(double score, String name) {
        this(name, score); // Delegates to the other constructor
    }

    public Student4(String name) {
        this(name, 0); // Default score is 0
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        if (numberOfQuizzes == 0) {
            return 0;
        }
        return totalScore / numberOfQuizzes;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void addQuiz(double score) {
        totalScore += score;
        numberOfQuizzes++;
    }

    public void printStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + getAverage());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        Student4 student = new Student4(studentName);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter score for Quiz " + i + ": ");
            double quizScore = scanner.nextDouble();
            student.addQuiz(quizScore);
        }

        System.out.println("\nStudent Information:");
        student.printStudent();

        scanner.close();
    }
}
