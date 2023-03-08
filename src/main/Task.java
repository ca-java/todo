public class Task {

    private int priority;
    private String name;
    private String description;
    private boolean completed;

    private Task(){
    }

    private Task(String name, String description, int priority, boolean completed) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
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
        private boolean status;

        public Builder(String name) {
            this.name = name;
        }

        public Task build() {
            return new Task(name, description, priority, status);
        }

        public Builder priority(int priority) {
            this.priority = priority;

            return this;
        }

        public Builder description(String description) {
            this.description = description;

            return this;
        }

        public Builder completed(boolean status) {
            this.status = status;

            return this;
        }
    }
}
