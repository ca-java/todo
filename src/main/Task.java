package main;
public class Task {

    private final String description;
    private final String name;
    private int priority = 0;
    /*
    Užduoties (task) turimos savybės:
    1. Pavadinimas
    2. Aprašas

    3. Užduoties statusas
    4. Prioritetas
    5. Data
     */

    public Task(String name) {
        this(name, "");
    }
    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void update(Task newTask) {
        // update task
    }

    public void setCompleted() {
        // complete
    }

    public boolean isCompleted() {
        return false;
    }
    @Override
    public String toString(){
        return String.format("name: %s, description %s", name, description);
    }
}
