
import java.util.List;

public class TaskManager {

    /*
    1. Peržiūrėti visas esamas užduotis (tasks)
    2. Pridėti naują užduotį
    3. Ištrinti pasirinktą užduotį
    4. Redaguoti pasirinktą užduotį
    5. Pažymėti užduotį kaip atliktą
    6. Išvesti į ekraną užduotis, kurios nėra atliktos
    7. Išvesti į ekraną visas užduotis, kurios jau yra atliktos
    8. Pašalinti visas atliktas užduotis
    9. Rūšiuoti užduotis pagal prioriteto tvarką
     */

    private List<Task> tasks;

    public TaskManager(List<Task> tasks){
        this.tasks = tasks;
    }

    public void sort(){
        // rikiavimo logika
    }

    public List<Task> tasks(){
        return tasks;
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

    public void update(Task newTask) {
        Task oldTask = tasks.get(tasks.indexOf(newTask));
        oldTask.update(newTask);
    }

    public List<Task> getcompletedTasks(){
        // return completed tasks
        return null;
    }

    public List<Task> getActiveTasks(){
        // return completed tasks
        return null;
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
