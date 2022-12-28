import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class TaskManagerTest {

    /*
    Ištestuoti funkcionalumą:
    8. grąžinti visus tasks
    1. grąžinti completed tasks sąrašą
    2. grąžinti active tasks sąrašą
    3. pridėti task
    4. ištrinti task
    5. atnaujinti
    6. grąžinti surikiuotus ASC
    7. grąžinti surikiuotus DESC
     */

    @Test
    void returnsAllTasks(){

        // initialize
        TaskDao taskDao = Mockito.mock(TaskDao.class);
        TaskManager taskManager = new TaskManager(taskDao);

        // when
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task.Builder("test-1").build());
        tasks.add(new Task.Builder("test-2").build());
        Mockito.when(taskDao.fetchTasks()).thenReturn(tasks);

        // then
        Assertions.assertEquals(
            tasks,
            taskManager.tasks()
        );
    }

}
