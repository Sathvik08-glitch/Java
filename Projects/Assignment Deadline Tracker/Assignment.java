public class Assignment {

    private String title;
    private String subject;
    private String deadline;

    public Assignment(String title, String subject, String deadline) {
        this.title = title;
        this.subject = subject;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title +
               "\nSubject: " + subject +
               "\nDeadline: " + deadline;
    }
}
