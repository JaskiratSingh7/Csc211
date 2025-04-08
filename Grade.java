
import javax.swing.JOptionPane;

public class PassFailExamDemoGUI {
    public static void main(String[] args) {
        int questions;
        int missed;
        double minPassing;

        // Input through GUI dialog boxes
        String input;

        input = JOptionPane.showInputDialog("How many questions are on the exam?");
        questions = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("How many questions did the student miss?");
        missed = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("What is the minimum passing score?");
        minPassing = Double.parseDouble(input);

        // Create a PassFailExam object
        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        // Prepare the result message
        String result = "Each question counts: " + exam.getPointsEach() + " points\n" +
                        "The exam score is: " + exam.getScore() + "\n" +
                        "The exam grade is: " + exam.getGrade();

        // Display the result in a dialog box
        JOptionPane.showMessageDialog(null, result);
    }
}
