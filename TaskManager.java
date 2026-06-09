class TaskManager {

    public void addTask(User user, String sub, String topic) {
        user.addTask(new Task(sub, topic));
    }

    public void showTasks(User user) {
        List<Task> tasks = user.getTasks();

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            System.out.println((i+1) + ". " + t.getSubject() +
                    " [" + (t.isCompleted() ? "Done" : "Pending") + "]");
        }
    }

    public void completeTask(User user, int index) {
        user.getTasks().get(index).markComplete();
    }
}