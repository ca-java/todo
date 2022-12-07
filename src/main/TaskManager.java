import java.util.ArrayList;
import java.util.List;


public class TaskManager {

    /*
    1. + Peržiūrėti visas esamas užduotis (tasks)
    2. + Pridėti naują užduotį
    3. + Ištrinti pasirinktą užduotį
    4. + Redaguoti pasirinktą užduotį
    5. + Pažymėti užduotį kaip atliktą
    6. + Išvesti į ekraną užduotis, kurios nėra atliktos
    7. + Išvesti į ekraną visas užduotis, kurios jau yra atliktos
    8. Pašalinti visas atliktas užduotis
    9. Rūšiuoti užduotis pagal prioriteto tvarką
     */

    private final List<Task> tasks = new ArrayList<>();

    public List<Task> tasks(){
        ArrayList<Task> list = new ArrayList<>();
        list.addAll(tasks);
        return list;
    }

    public List<Task> tasks(Task.OrderType orderType) {

        ArrayList<ArrayList<Task>> tasksPriority = new ArrayList<>(); //multidimensional list for 4 categories of priority
        tasksPriority.add(new ArrayList<Task>());
        tasksPriority.add(new ArrayList<Task>());
        tasksPriority.add(new ArrayList<Task>());
        tasksPriority.add(new ArrayList<Task>());

        ArrayList<Task> list = new ArrayList<>();

        for (Task currentTask : tasks) { // distributing active tasks into priority categories
            if (!currentTask.isCompleted()) {
                tasksPriority.get(currentTask.getPriority()).add(currentTask);
            }
        }

        if (orderType == Task.OrderType.ASC) { // fusing categories of priority into ascending list
            for (int i = 0; i < 4; i++) {
                list.addAll(tasksPriority.get(i));
            }
        } else {
            for (int i = 3; i >= 0; i--) {
                list.addAll(tasksPriority.get(i));
            }
        }
        return list;
    }

    public void sort() {
        // rikiavimo logika
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

    public boolean update(Task oldTask, Task newTask) {
        if (tasks.contains(oldTask)) {
            tasks.remove(oldTask);
            tasks.add(newTask);
            return true;
        } else
            return false;
    }

    public List<Task> getCompletedTasks() {
        // return completed tasks
        List<Task> result = new ArrayList<>();
        for (Task task: tasks) {
            if (task.isCompleted())
                result.add(task);
        }
        return result;
    }

    public List<Task> getActiveTasks() {
        // return incomplete tasks
        List<Task> result = new ArrayList<>();
        for (Task task: tasks) {
            if (!task.isCompleted())
                result.add(task);
        }
        return result;
    }

    public void removeAllCompleted() {
        // remove all completed tasks
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task task: tasks) {
            if (task.isCompleted())
                tasksToRemove.add(task);
        }
        tasks.removeAll(tasksToRemove);
    }

    public void checkCompleted(Task task) {
        // logika surandu task'a ir ji complete'inu
        tasks.get(tasks.indexOf(task)).setCompleted();
    }





}
