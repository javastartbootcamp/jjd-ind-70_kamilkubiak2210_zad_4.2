package pl.javastart.task;

public class Tasks {
    private final String taskName;
    private final String taskDescription;
    private int priority;
    Person person;

    public Tasks(String taskName, String taskDescription, int priority, Person person) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.person = person;
    }

    public Tasks(String taskName, String taskDescription, int priority) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.priority = priority;
    }

    public Tasks(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public int getPriority() {
        return priority;
    }

    public Person getPerson() {
        return person;
    }

    public boolean highPriority(int priority) {
        return priority >= 1;
    }

    public boolean mediumPriority(int priority) {
        return priority == 0;
    }

    public boolean lowPriority(int priority) {
        return priority <= -1;
    }
}
