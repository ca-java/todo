public class Task {

    private final String name;
    private final String description;
    private int priority = 0;
    private boolean completionStatus;
    /*
    Užduoties (task) turimos savybės:
    1. Pavadinimas
    2. Aprašas

    3. Užduoties statusas
    4. Prioritetas
    5. Data
     */

    public Task(String name) {
        this(name, "", 0);
    }

    public Task(String name, int priority) {
        this(name, "", priority);
    }


    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.completionStatus = false;
    }

    public Task(String name, String description) {
        this(name, description, 0);
    }


    public void setCompleted() {
        this.completionStatus = true;
    }

    public boolean isCompleted() {
        return completionStatus;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return String.format("name: %s, description: %s, priority: %d", name, description, priority);
    }

    public enum OrderType {
        ASC,
        DESC;
    }


}
