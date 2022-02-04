public class Event extends Task {
    protected String time;


    public Event(String taskName, String time) {
        super(taskName);
        this.time = time;
    }

    public Event(String taskName, String time, boolean done) {
        super(taskName, done);
        this.time = time;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(at:" + time + ")";
    }
}
