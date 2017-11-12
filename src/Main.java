import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] str){
        Core cpu1 = new Core();
        Core cpu2 = new Core();
        Queue f1 = new Queue();
        Queue f2 = new Queue();
        Queue f3 = new Queue();
        Random random = new Random();
        Stack<Task> stack = new Stack<>();
        int time;
        for (time = 0; time<10000; time++){
            if (f1.isNotFull() && f2.isNotFull() && f3.isNotFull()){
                Task task = new Task();
                if (task.getPriority() == 0){
                    f1.addTask(task);
                    task.setQueue(f1);
                }
                else{
                    if(task.getPriority() == 1){
                        f2.addTask(task);
                        task.setQueue(f2);
                    }
                    else{
                        f3.addTask(task);
                        task.setQueue(f3);
                    }
                }
            }
            if (f1.isNotEmpty()) {
                if (!cpu1.isBusy() || cpu1) {
                    cpu1.setCurrentTask(f1.readTop());
                } else {
                    if (!cpu2.isBusy()) {
                        cpu2.setCurrentTask(f1.readTop());
                    }
                }
            }else {
                if(f2.isNotEmpty()){

                }
            }


            cpu1.work();
            cpu2.work();
        }
        System.out.print("\n" + time);
    }
}
