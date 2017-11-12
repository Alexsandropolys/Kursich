import java.util.Random;

public class Task {
    public void setTime(int time) {
        this.time = time;
    }

    private int time;

    public Queue getQueue() {
        return queue;
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    private Queue queue;

    public int getPriority() {
        return priority;
    }

    private int priority;

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
    Random random = new Random();
    private String name;
    public Task(){
        this.time = random.nextInt(4);
        this.name = "Task_" + random.nextInt(1000);
        this.priority = 0;
    }
}
