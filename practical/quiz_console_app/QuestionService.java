import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Which keyword is used to inherit a class in Java?",
                new String[] { "extends", "implements", "inherits", "instanceof" }, "extends");
        questions[1] = new Question(2, "Which method is the entry point of a Java application?",
                new String[] { "start()", "main()", "run()", "init()" }, "main()");
        questions[2] = new Question(3, "Which of these is not a Java primitive type?",
                new String[] { "int", "String", "boolean", "double" }, "String");
        questions[3] = new Question(4, "What is the size of an int variable in Java?",
                new String[] { "8 bits", "16 bits", "32 bits", "64 bits" }, "32 bits");
        questions[4] = new Question(5, "Which package contains the Scanner class?",
                new String[] { "java.util", "java.io", "java.lang", "java.net" }, "java.util");
    }

    public void displayQuestions() {
        System.out.println("Inside displayQuestions method");
        for (Question q : questions) {
            System.out.println(q);
            // System.out.println(question.getQuestion());
        }
    }

    public void playQuiz() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println("Question No: " + q.getId());
            System.out.println(q.getQuestion());
            String[] options = q.getoptions();
            for (String option : options)
                System.out.println(" - " + option);

            this.selections[i++] = sc.nextLine();
        }
        sc.close();
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getAnswer().equalsIgnoreCase(selections[i]))
                score++;
        }
        System.out.println("Your score is: " + score + " out of " + questions.length);
    }
}
