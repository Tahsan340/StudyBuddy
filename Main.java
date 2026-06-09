import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("Boss");

        TaskManager tm = new TaskManager();
        PomodoroTimer timer = new PomodoroTimer();
        ProgressTracker pt = new ProgressTracker();
        MissionManager mm = new MissionManager();
        FocusEngine fe = new FocusEngine();
        ChatEngine chat = new ChatEngine();

        while (true) {

            System.out.println("\n==== StudyBuddy ====");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Start Timer");
            System.out.println("5. Show Progress");
            System.out.println("6. Chat");
            System.out.println("7. Focus Score");
            System.out.println("0. Exit");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    System.out.print("Subject: ");
                    String sub = sc.nextLine();
                    System.out.print("Topic: ");
                    String topic = sc.nextLine();
                    tm.addTask(user, sub, topic);
                    break;

                case 2:
                    tm.showTasks(user);
                    break;

                case 3:
                    tm.showTasks(user);
                    System.out.print("Task number: ");
                    int idx = sc.nextInt() - 1;
                    tm.completeTask(user, idx);
                    break;

                case 4:
                    timer.start(user);
                    break;

                case 5:
                    System.out.println("Completed Tasks: " + pt.completedTasks(user));
                    System.out.println("Study Hours: " + pt.studyHours(user));
                    mm.showMission();
                    System.out.println("Mission Done: " + mm.check(user));
                    break;

                case 6:
                    System.out.print("You: ");
                    String msg = sc.nextLine();
                    System.out.println("Bot: " + chat.respond(msg, user));
                    break;

                case 7:
                    System.out.println("Focus Score: " + fe.calculate(user));
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}