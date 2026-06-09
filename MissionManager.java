class MissionManager {

    public void showMission() {
        System.out.println("Complete 2 tasks & 2 sessions");
    }

    public boolean check(User user) {
        ProgressTracker p = new ProgressTracker();

        return p.completedTasks(user) >= 2 &&
                user.getSessions().size() >= 2;
    }
}