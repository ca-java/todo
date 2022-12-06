import java.util.Comparator;

public class PriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {

        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}







