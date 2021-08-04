package practice05;

public class Teacher extends  Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        String classString = "I teach Class " + klass + ".";

        if (klass == 0) {
            classString = "I teach No Class.";
        }

        return super.introduce() + " I am a Teacher. " + classString;
    }
}
