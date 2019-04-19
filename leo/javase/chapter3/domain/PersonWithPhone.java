package leo.javase.chapter3.domain;

public class PersonWithPhone {

    private  String name;
    private int age;
    private Phone phone;

    public PersonWithPhone() {
    }

    public PersonWithPhone(String name, int age, Phone phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
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

    public void runChicken(){
        System.out.println(this.name+"在用"+this.phone.getOs()+"系统"+this.phone.getScrean()+"的屏幕吃鸡");
    }

    @Override
    public String toString() {
        return "PersonWithPhone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
