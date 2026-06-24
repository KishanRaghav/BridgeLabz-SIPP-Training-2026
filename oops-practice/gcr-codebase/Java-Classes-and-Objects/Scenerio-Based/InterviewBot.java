public class InterviewBot {
    private String botName;
    private String technology;

    public InterviewBot(String botName, String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    public void conductInterview() {
        System.out.println(botName + " is conducting " + technology + " interview");
    }

    public static void main(String[] args) {
        InterviewBot b1 = new InterviewBot("Alpha", "Java");
        InterviewBot b2 = new InterviewBot("Beta", "Python");
        InterviewBot b3 = new InterviewBot("Gamma", "React");

        b1.conductInterview();
        b2.conductInterview();
        b3.conductInterview();
    }
}