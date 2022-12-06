import java.util.Comparator;

public class PriorityComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {

       return (o1.priority < o2.priority) ? -1: (o1.priority > o2.priority) ? 1:0;

    }
    }







