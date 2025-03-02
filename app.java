import java.util.*;

class Task {
    String title;
    String dueDate;

    Task(String title, String dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task: " + title + " | Due: " + dueDate;
    }
}

public class TaskManager {
    private static final List<Task> tasks = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter due date (YYYY-MM-DD): ");
                    String dueDate = scanner.nextLine();
                    tasks.add(new Task(title, dueDate));
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.println("\nYour Tasks:");
                    for (Task task : tasks) {
                        System.out.println(task);
                    }
                    break;
                case 3:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
