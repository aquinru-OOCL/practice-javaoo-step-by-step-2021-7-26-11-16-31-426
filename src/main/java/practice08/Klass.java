package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final int klass;
    private Student leader;
    private final List<Student> studentList = new ArrayList<Student>();

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return String.format("Class %s", klass);
    }

    public Student assignLeader(Student student) {
        if (studentList.contains(student)) {
            return this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
            return null;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        studentList.add(member);
    }

}
