package todo.command;

import todo.service.Task;
import todo.service.TaskManager;

public class AddTaskCommand implements Command{
    private TaskManager taskManager;
    private Task task;

    public AddTaskCommand(TaskManager taskManager, int priority,String content) {
        this.taskManager = taskManager;
        this.task = new Task(priority,content);
    }

    @Override
    public void execute() {
        taskManager.addTask(task);
    }

    @Override
    public void undo() {
        taskManager.removeTask(task);
        System.out.println("할 일 취소");
    }
}
