package data;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private List<Task> tasks;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void updateTask(Task taskToUpdate) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getTaskId() == taskToUpdate.getTaskId()) {
                tasks.set(i, taskToUpdate);
                break;
            }
        }
    }

    public void deleteTask(int taskId) {
        tasks.removeIf(task -> task.getTaskId() == taskId);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
