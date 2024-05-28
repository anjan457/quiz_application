public class Question {
    private String question;
    private String[] options;
    private char answer;

    public Question(String question, String[] options, char answer) {
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public char getAnswer() {
        return answer;
    }
}
