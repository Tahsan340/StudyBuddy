class ChatEngine {

    public String respond(String msg, User user) {

        msg = msg.toLowerCase();
        ProgressTracker p = new ProgressTracker();

        if (msg.contains("hello"))
            return "Hello " + user.getName();

        if (msg.contains("motivation"))
            return "Stay consistent!";

        if (msg.contains("progress"))
            return "Completed: " + p.completedTasks(user);

        if (msg.contains("study"))
            return "Start Pomodoro session";

        return "Keep going!";
    }
}