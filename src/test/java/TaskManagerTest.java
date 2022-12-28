import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TaskManagerTest {

    @Mock private TaskDao taskDao;
    @InjectMocks private TaskManager manager;

    @Test
    void returnsAllTasks(){

        // given
        List<Task> expected = new ArrayList<>();
        expected.add(new Task.Builder("test-1").build());
        expected.add(new Task.Builder("test-2").build());

        // when
        Mockito.when(taskDao.fetchTasks()).thenReturn(expected);

        // then
        Assertions.assertEquals(
            expected,
            manager.tasks()
        );
    }

    @Test
    void returnsAllCompletedTasks(){

        // given
        List<Task> expected = List.of(
            new Task.Builder("test-1").completed(true).build(),
            new Task.Builder("test-3").build()
        );

        // when
        Mockito.when(taskDao.fetchTasks()).thenReturn(expected);

        // then
        Assertions.assertEquals(
            List.of(expected.get(0)),
            manager.getCompletedTasks()
        );
    }

    @Test
    void returnsAllActiveTasks(){

        // given
        List<Task> expected = List.of(
                new Task.Builder("test-1").completed(true).build(),
                new Task.Builder("test-3").build()
        );

        // when
        Mockito.when(taskDao.fetchTasks()).thenReturn(expected);

        // then
        Assertions.assertEquals(
                List.of(expected.get(1)),
                manager.getActiveTasks()
        );
    }

    @Test
    void testAscendingOrder(){
        /// given
        Task t1 = new Task.Builder("test-1").priority(1).build();
        Task t2 = new Task.Builder("test-2").priority(3).build();
        Task t3 = new Task.Builder("test-3").priority(0).build();

        // when
        Mockito.when(taskDao.fetchTasks()).thenReturn(
            List.of(t1, t2, t3)
        );

        // then
        Assertions.assertEquals(
            List.of(t3, t1, t2),
            manager.sortASC()
        );
    }

    @Test
    void testDescendingOrder(){
        // given
        Task t1 = new Task.Builder("test-1").priority(1).build();
        Task t2 = new Task.Builder("test-2").priority(3).build();
        Task t3 = new Task.Builder("test-3").priority(0).build();

        // when
        Mockito.when(taskDao.fetchTasks()).thenReturn(
            List.of(t1, t2, t3)
        );

        // then
        Assertions.assertEquals(
            List.of(t2, t1, t3),
            manager.sortDESC()
        );
    }
}
