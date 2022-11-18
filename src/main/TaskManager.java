import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    /*
    1. Peržiūrėti visas esamas užduotis (tasks)
    2. Išsaugoti naują užduotį
    3. Ištrinti pasirinktą užduotį
    4. Redaguoti pasirinktą užduotį
    5. Pažymėti užduotį kaip atliktą
    6. Išvesti į ekraną užduotis, kurios nėra atliktos
    7. Išvesti į ekraną visas užduotis, kurios jau yra atliktos
    8. Pašalinti visas atliktas užduotis
    9. Rūšiuoti užduotis pagal prioriteto tvarką
     */

    private List<Task> tasks = new ArrayList<>();


    public void sort(){
        // rikiavimo logika
    }

    public List<Task> tasks(){
        return new ArrayList<>(tasks);
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

    public List<Task> completed(){
        // return completed tasks
        return null;
    }

    public void checkCompleted(String name){
        // logika surandu task'a ir ji complete'inu
    }
}
