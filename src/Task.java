public class Task {

    private String name;
    private Priority priority;

    public Task(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public void displayDetails() {
        System.out.print("Task: " + name);
        System.out.println("|");
        System.out.print("Priority" + priority);
    }
}
