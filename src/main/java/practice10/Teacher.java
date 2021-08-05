package practice10;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classesList = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classesList) {
        super(id, name, age);
        this.classesList = classesList;
        classesList.forEach(klass -> klass.addTeacher(this));
    }

    public Teacher(int id, String name, int age) {
        super(id, name ,age);
    }

    public LinkedList<Klass> getClasses() {
        return classesList;
    }

    public String introduce() {
        String classString = "I teach No Class.";

        if (!classesList.isEmpty()) {
            classString = String.format("I teach Class %s.", classesList
                                                                .stream()
                                                                .map(klass -> Integer.toString(klass.getNumber()))
                                                                .collect(Collectors.joining(", ")));
        }

        return String.format("%s I am a Teacher. %s", super.introduce(), classString);
    }

    public String introduceWith(Student student) {
        String supplementString = "I teach";

        if (!classesList.contains(student.getKlass())) {
            supplementString = "I don't teach";
        }

        return String.format("%s I am a Teacher. %s %s.", super.introduce(), supplementString, student.getName());
    }

    public boolean isTeaching(Student student) {
        return classesList
                .stream()
                .anyMatch(klass -> klass.getNumber() == klass.isIn(student));
    }

    public void notifyAStudentJoined(Klass klass, Student student) {
        System.out.printf("I am %s. I know %s has joined Class %s.\n", super.getName(), student.getName(), klass.getNumber());
    }

    public void notifyAssignLeader (Klass klass, Student leader) {
        System.out.printf("I am %s. I know %s become Leader of Class %s.\n", super.getName(), leader.getName(), klass.getNumber());
    }
}
