package data;

import java.util.List;

public class TaskRepository {

    private List<Task> tasks;

    public TaskRepository(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
