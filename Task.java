public class Task {

    private String subject;
    private String topic;
    private boolean completed;

    public Task(String subject, String topic) {
        this.subject = subject;
        this.topic = topic;
        this.completed = false;
    }

    public void markComplete() { completed = true; }
    public boolean isCompleted() { return completed; }

    public String getSubject() { return subject; }
    public String getTopic() { return topic; }
}