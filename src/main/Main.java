import java.util.List;

public class Main {

    public static void main(String[] args) {
        var task1 = new Task("Paskambinti mamai", "Paskambinti, nes noriu susitarti");
        var task2 = new Task("Paskambinti tėčiui", "Paskambinti, nes noriu pasimatyti");
        var task3 = new Task("Paskambinti sesei", "Paskambinti, nes noriu sužinoti");

        var manager = new TaskManager();

        manager.add(task1);
        manager.add(task2);
        manager.add(task3);

        print(manager.tasks());




    }

    private static void print(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
