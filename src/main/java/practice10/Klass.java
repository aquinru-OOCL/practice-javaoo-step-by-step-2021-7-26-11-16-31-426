package practice10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    private final int klass;
    private Student leader;
    private final List<Student> studentList;
    private final List<Teacher> teachers;

    public Klass(int klass) {
        this.klass = klass;
        studentList = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return String.format("Class %d", getNumber());
    }

    public void assignLeader(Student student) {
        if (studentList.contains(student)) {
            this.leader = student;
            teachers.forEach(teacher -> teacher.notifyAssignLeader(this, leader));
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student member) {
        studentList.add(member);
        teachers.forEach(teacher -> teacher.notifyAStudentJoined(this, member));
    }

    public void addTeacher(Teacher teacher) {
        if(!teachers.contains(teacher)) {
            teachers.add(teacher);
        }
    }

    public int isIn (Student student) {
        return student.getKlass().getNumber();
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

}
