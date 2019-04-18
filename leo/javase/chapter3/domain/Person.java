package leo.javase.chapter3.domain;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void runChicken(Phone phone){
        System.out.println(name+"在用"+phone.getOs()+"系统"+phone.getScrean()+"的屏幕吃鸡");
    }
}
