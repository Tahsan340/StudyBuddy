class PomodoroTimer {

    private int studyMinutes = 1; // change later
    private int breakMinutes = 1;

    public void start(User user) {

        System.out.println("Study Started");
        runTimer(studyMinutes);

        System.out.println("Break Time");
        runTimer(breakMinutes);

        user.addSession(new StudySession(studyMinutes));
    }

    private void runTimer(int minutes) {

        int seconds = minutes * 60;

        while (seconds > 0) {

            int m = seconds / 60;
            int s = seconds % 60;

            System.out.printf("%02d:%02d\n", m, s);

            try { Thread.sleep(1000); } catch (Exception e) {}

            seconds--;
        }
    }
}