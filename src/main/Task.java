public class Task {

    private final int priority;
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

    private Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public void setCompleted() {
        this.completionStatus = true;
    }

    public boolean isCompleted() {
        return completionStatus;
    }

    @Override
    public String toString() {

        return String.format("name: %s, description: %s, priority: %s", name, description, priority);
    }

    public int getPriority() {
        return priority;
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
