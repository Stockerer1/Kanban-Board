package data;

import java.util.List;

public class Task {

    private String title;
    private String description;
    private int taskId;
    private List<String> labels;
    private String status;

    public Task(String title, String description, int taskId, List<String> labels, String status) {
        this.title = title;
        this.description = description;
        this.taskId = taskId;
        this.labels = labels;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

