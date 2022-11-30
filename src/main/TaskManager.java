package main;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    /*

    2. + Pridėti naują užduotį
    3. + Ištrinti pasirinktą užduotį
    4. + Redaguoti pasirinktą užduotį
    5. + Pažymėti užduotį kaip atliktą
    6. Išvesti į ekraną užduotis, kurios nėra atliktos
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

    public void sort(){
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

    public List<Task> getCompletedTasks(){
        // return completed tasks
        List<Task> result = new ArrayList<>();
        for (Task task: tasks) {
            if (task.isCompleted())
                result.add(task);
        }
        return result;
    }

    public List<Task> getActiveTasks(){
        // return incomplete tasks
        List<Task> result = new ArrayList<>();
        for (Task task: tasks) {
            if (!task.isCompleted())
                result.add(task);
        }
        return result;
    }

    public void removeAllCompleted(){
        // remove all completed tasks
    }

    public void checkCompleted(Task task){
        // logika surandu task'a ir ji complete'inu
        tasks.get(tasks.indexOf(task)).setCompleted();
    }

    public List<Task> order(){
        // rikiuojame pagal prioriteta
        return null;
    }
}
