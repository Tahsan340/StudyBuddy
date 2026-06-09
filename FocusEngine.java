class FocusEngine {

    public int calculate(User user) {

        ProgressTracker p = new ProgressTracker();

        int tasks = p.completedTasks(user);
        int sessions = user.getSessions().size();

        int score = (tasks * 10) + (sessions * 15);

        if (tasks >= 2 && sessions >= 2)
            score += 20;

        return score;
    }
}