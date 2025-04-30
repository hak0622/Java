package todo.command;

import java.util.Stack;

public class CommandInvoker {
    //명령 관리자
    private Stack<Command>history = new Stack<>();

    //전달 받은 Command를 실행하는 메소드
    public void executeCommand(Command command){
        command.execute();
        history.push(command);
    }

    //마지막 명령어 되돌리기
    public void undoLastCommand(){
        if(history.isEmpty()){
            System.out.println("취소할 명령어가 없음");
            return;
        }
        Command command = history.pop(); //마지막 명령어 꺼내오기
        command.undo(); // 실행 취소 메소드 호출
    }
}
