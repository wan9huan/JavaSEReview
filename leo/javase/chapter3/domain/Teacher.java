package leo.javase.chapter3.domain;

public class Teacher {

    private String name;
    private String gender;
    private int age;
    private Computer computer;

    public Teacher() {
    }

    public Teacher(String name, String gender, int age, Computer computer) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", computer=" + computer +
                '}';
    }
}
