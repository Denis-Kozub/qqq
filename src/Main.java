import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
                "1. Англійским займенник є.\n" +
                        "   a) I\n" +
                        "   b) You\n" +
                        "   c) He\n" +
                        "   d) All answer is correct\n",

                "2. Як буде ЙОГО на англійскій мові? \n" +
                        "   a) He\n" +
                        "   b) His\n" +
                        "   c) Her\n" +
                        "   d) No article needed\n",

                "3. Як буде ЇЇ на англійскій мові? \n" +
                        "   a) She\n" +
                        "   b) His\n" +
                        "   c) Her\n" +
                        "   d) No article needed\n",

                "4. Як правильно сказати Воно/Його \n" +
                        "   a) It/Its\n" +
                        "   b) We/Our\n" +
                        "   c) Her/Him\n" +
                        "   d) No article needed\n",


                "5. Займенники з якими добавяэться закінчення s/es в Present Simple \n" +
                        "   a) He/She/It\n" +
                        "   b) We/You/They\n" +
                        "   c) I\n" +
                        "   d) No article needed\n"
        };

        String[] correctAnswers = {"d", "b", "c", "a", "a"};
        int score = 0;
        int totalQuestions = questions.length;

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals("1111")) {
                System.out.println("Answers: " + correctAnswers[i]);
                continue;
            }

            if (userAnswer.equals(correctAnswers[i])) {
                score++;
            } else if (!userAnswer.matches("[abcd]")) {
                System.out.println("Incorrect answer. Please enter a, b, c, or d.");
                i--;
            }
        }

        double percentageScore = (double) score / totalQuestions * 100;
        System.out.println("Score: " + percentageScore + "%");

        scanner.close();
        System.out.println("Hello world");
    }
}