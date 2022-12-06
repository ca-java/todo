import java.util.Comparator;

public class PriorityComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {

        if (o1.priority > o2.priority)
            return +1;
        else
            return -1;

    }
    }







