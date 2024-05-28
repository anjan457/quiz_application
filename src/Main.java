
public class Main {
    public static void main(String[] args) {
        Question[] questions = {
                new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Lisbon"}, 'C'),
                new Question("What is the largest planet?", new String[]{"Earth", "Mars", "Jupiter", "Saturn"}, 'C'),
                new Question("Who wrote 'Hamlet'?", new String[]{"Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen"}, 'B'),
                new Question("What is the smallest prime number?", new String[]{"1", "2", "3", "5"}, 'B'),
                new Question("What is the chemical symbol for water?", new String[]{"O2", "H2O", "CO2", "HO"}, 'B'),
                new Question("What year did the Titanic sink?", new String[]{"1912", "1914", "1916", "1918"}, 'A'),
                new Question("Who painted the Mona Lisa?", new String[]{"Vincent Van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"}, 'C'),
                new Question("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter", "Venus"}, 'B'),
                new Question("What is the square root of 64?", new String[]{"6", "7", "8", "9"}, 'C'),
                new Question("Who was the first President of the United States?", new String[]{"Abraham Lincoln", "Thomas Jefferson", "George Washington", "John Adams"}, 'C')
        };

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
