import java.util.ArrayList;
import java.util.Stack;

public class Queue {
    private Stack<Task> tasks = new Stack<>();
    public boolean isNotFull(){
        return (tasks.size()<100);
    }
    public boolean isNotEmpty(){
        return (!tasks.empty());
    }
    public Task readTop(){
        return tasks.pop();
    }
    public void addTask(Task task){
        tasks.push(task);
    }
}
