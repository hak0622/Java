package todo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TaskManager {
    //추가 된 할 일을 우선순위 오름차순으로 저장할 TreeSet 객체
    private TreeSet<Task>tasks = new TreeSet<Task>();

    //할 일 추가
    public void addTask(Task task){
        tasks.add(task);
        System.out.println("할 일이 추가됨 : "+task);
    }

    //할 일 삭제
    public void removeTask(Task task){
        tasks.remove(task);
        System.out.println("할 일이 삭제됨 : "+task);
    }

    //할 일 목록 출력
    public void listTasks(){
        System.out.println("\n ===== 할 일 목록 =====\n");

        if(tasks.isEmpty()){
            System.out.println("등록된 할 일이 없음");
            return;
        }
        int index = 1;
        for(Task task : tasks){
            System.out.println(index++ +". "+task);
        }
    }
    public List<Task>getTaskAsList(){
        return new ArrayList<>(tasks);
    }
}
