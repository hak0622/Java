package todo.command;

import todo.service.Task;
import todo.service.TaskManager;

import java.util.List;

public class DeleteTaskCommand implements Command{
    private TaskManager taskManager;
    private Task task;

    public DeleteTaskCommand(TaskManager taskManager, int index){
        this.taskManager = taskManager;

        //할 일 목록을 List 형태로 얻어오기
        List<Task>tasks = taskManager.getTaskAsList();

        if(index >=0 && index < tasks.size()){
            this.task = tasks.get(index);
        }else{
            throw new IndexOutOfBoundsException("유효하지 않은 할 일 번호입니다.");
        }
    }

    @Override
    public void execute() {
        taskManager.removeTask(task);
    }

    @Override
    public void undo() {
        taskManager.addTask(task);
        System.out.println("할 일 삭제가 취소됨");
    }
}
