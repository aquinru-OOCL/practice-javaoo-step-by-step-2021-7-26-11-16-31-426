package practice10;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        Student leader = klass.getLeader();
        String supplementString = "I am at Class";

        if (leader != null) {
            supplementString = "I am Leader of Class";
        }

        return String.format("%s I am a Student. %s %s.", super.introduce(), supplementString, klass.getNumber());
    }

}
