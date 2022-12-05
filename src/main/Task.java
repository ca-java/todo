public class Task {

    private int priority;
    private final String name;
    private final String description;
    private boolean completionStatus;
    /*
    Užduoties (task) turimos savybės:
    1. Pavadinimas
    2. Aprašas

    3. Užduoties statusas
    4. Prioritetas
    5. Data
     */

    public Task(String name){
        this(name, "", 0);
    }

    public Task(String name, String description, int priority){
        this.name = name;
        this.description = description;
        this.completionStatus = false;
        this.priority = priority;
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

    @Override
    public String toString() {
        return String.format("name: %s, description: %s", name, description);
    }
}
