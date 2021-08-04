package practice07;

public class Klass {
    private final int klass;
    private Student leader;

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return String.format("Class %s", klass);
    }

    public void assignLeader(Student student) {
        leader = student;
    }

    public Student getLeader() {
        return leader;
    }

}
