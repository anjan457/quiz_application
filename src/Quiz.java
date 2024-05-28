import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((char)('A' + i) + ": " + options[i]);
            }

            System.out.print("Your answer: ");
            char answer = scanner.next().charAt(0);

            if (Character.toUpperCase(answer) == question.getAnswer()) {
                score++;
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}
