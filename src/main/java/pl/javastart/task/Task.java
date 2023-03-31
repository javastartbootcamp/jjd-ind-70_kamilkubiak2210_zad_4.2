package pl.javastart.task;

public class Task {
    private final String name;
    private final String description;
    private int priority;
    private Person person;


    public Task(String name, String description, int priority, Person person) {
        this(name,description,priority);
        this.person=person;
    }

    public Task(String name, String description, int priority) {
        this(name,description);
        this.priority=priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
