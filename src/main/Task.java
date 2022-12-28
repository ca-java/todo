public class Task {

    private int priority;
    private String name;
    private String description;
    private boolean completed;
    /*
    Užduoties (task) turimos savybės:
    1. Pavadinimas
    2. Aprašas

    3. Užduoties statusas
    4. Prioritetas
    5. Data
     */

    private Task(){
    }

    private Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public void setCompleted() {
        this.completed = true;
    }

    public boolean getCompleted() {
        return completed;
    }

    @Override
    public String toString() {

        return String.format("name: %s, description: %s, priority: %s", name, description, priority);
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        String name;
        private int priority;
        private String description;

        public Builder(String name) {
            this.name = name;
        }

        public Task build() {
            return new Task(name, description, priority);
        }

        public Builder priority(int priority) {
            this.priority = priority;

            return this;
        }

        public Builder description(String description) {
            this.description = description;

            return this;
        }
    }
}
