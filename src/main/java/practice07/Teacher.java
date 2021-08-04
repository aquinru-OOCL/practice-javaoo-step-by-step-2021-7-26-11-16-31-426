package practice07;

public class Teacher extends Person {
    private final Klass klass;
    String teacherString = "I am a Teacher.";

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String classString = "I teach No Class.";

        if (klass != null) {
            classString = String.format("I teach Class %s.", klass.getNumber());
        }

        return String.format("%s %s %s", super.introduce(), teacherString, classString);
    }

    public String introduceWith(Student student) {
        String supplementString = "I don't teach";

        if (student.getKlass().getNumber() == klass.getNumber()) {
            supplementString = "I teach";
        }
        return String.format("%s %s %s %s.", super.introduce(), teacherString, supplementString, student.getName());
    }

}
