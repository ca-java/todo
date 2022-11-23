package main;
import java.util.List;

public class App {

    public static void main(String[] args) {
//        new Task('Paskambinti Tevams', 'Paskambinti nes reikia susitarti del savaitgalio');
//        new Task('Paskambinti Tevams', 'Paskambinti nes reikia susitarti del savaitgalio');
//        new Task('Paskambinti Tevams', 'Paskambinti nes reikia susitarti del savaitgalio');
//
        TaskManager manager = new TaskManager();
//        manager.add(task1);
//        manager.add(task2);
//        manager.add(task3);


        print(manager.tasks());
    }

    private static void print(List<Task> tasks) {
        for(Task task: tasks)
            System.out.println(task.toString());
    }
}
