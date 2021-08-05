package practice09;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> classesList = new LinkedList<>();

    public Teacher(int id, String name, int age, LinkedList<Klass> classesList) {
        super(id, name, age);
        this.classesList = classesList;
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
        return classesList.contains(student.getKlass());
    }
}
