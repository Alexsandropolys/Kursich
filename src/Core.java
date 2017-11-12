public class Core {
    public void setCurrentTask(Task currentTask) {
        this.currentTask = currentTask;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    private Task currentTask = null;
    public void work(){
        if (isBusy()) {
            if (currentTask.getTime() == 0) {
                System.out.print("\n" + currentTask.getName() + " is done.");
                this.currentTask = null;
            }
            else{
            currentTask.setTime(currentTask.getTime() - 1);
            }
        }
    }
    public boolean isBusy(){
        if(currentTask!=null){
            return true;
        }
        else return false;
    }
}
