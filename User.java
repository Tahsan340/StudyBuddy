import java.util.*;

public class User {

    private String name;
    private List<Task> tasks;
    private List<StudySession> sessions;

    public User(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
        this.sessions = new ArrayList<>();
    }

    public void addTask(Task t) {
        tasks.add(t);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addSession(StudySession s) {
        sessions.add(s);
    }

    public List<StudySession> getSessions() {
        return sessions;
    }

    public String getName() {
        return name;
    }
}