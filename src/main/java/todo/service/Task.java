package todo.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task implements Comparable<Task>{
    private int priority;  //할 일 우선순위 (1~5, 1이 높음)
    private String content;

    @Override
    public String toString(){
        return "[우선순위:"+priority+"]"+content;
    }
    public int compareTo(Task other){
        int priorityCompare = this.priority - other.priority;
        if(priorityCompare != 0){
            return priorityCompare; // 양수 (자리바꿈), 음수(유지)
        }

        return this.content.compareTo(other.content);
    }
}
