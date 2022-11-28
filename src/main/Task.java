package main;

public class Task {

    private int priority = 0;
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
        this(name, "");
    }

    public Task(String name, String description){
        this.name = name;
        this.description = description;
        this.completionStatus = false;
    }

    public void setCompleted() {
        this.completionStatus = true;
    }

    public boolean isCompleted() {
        return completionStatus;
    }

    @Override
    public String toString() {
        return String.format("name: %s, description: %s", name, description);
    }
}
