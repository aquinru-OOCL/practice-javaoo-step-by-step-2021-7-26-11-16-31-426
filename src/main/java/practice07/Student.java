package practice07;

public class Student extends Person {
    private final Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        Student leader = klass.getLeader();
        //String leaderName = leader.getName();
        String introduceString = "I am a Student.";
        String supplementString = "I am at Class";

        if (leader != null) {
            supplementString = "I am Leader of Class";
        }

        return String.format("%s %s %s %s.", super.introduce(), introduceString, supplementString, klass.getNumber());
    }
}
