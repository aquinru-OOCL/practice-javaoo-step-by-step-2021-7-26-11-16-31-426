package practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private final int klass;
    private Student leader;
    private final List<Student> studentList = new ArrayList<>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klass)) return false;
        Klass klass1 = (Klass) o;
        return klass == klass1.klass && Objects.equals(leader, klass1.leader) && Objects.equals(studentList, klass1.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(klass, leader, studentList);
    }

    //override equals
}
