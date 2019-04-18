package leo.javase.chapter3;

import leo.javase.chapter3.domain.*;

import org.junit.Test;


public class TestClass {


    public void changerGender(Teacher teacher){
        teacher.setAge(18);
    }

    @Test
    public void testObjectParam(){


        Teacher teacher = new Teacher("马萍","女",24);
        changerGender(teacher);
        System.out.println(teacher.getAge());
    }

    @Test
    public void testRunChicken(){

        Phone phone = new Phone("Android","1920x1080");

        Person person = new Person("王欢",24);

        person.runChicken(phone);
    }

    @Test
    public void testCreateArray(){
        int[] intArrays;
        //声明了一个int数组
        intArrays= new int[5];
        //创建数组：使用new关键字 中括号内数字表示元素个数
        intArrays[0] = 11;
        intArrays[1] = 22;
        intArrays[2] = 33;
        intArrays[3] = 44;
        intArrays[4] = 55;
        for (int intArray:intArrays) {
            System.out.println(intArray);
        }
    }

    @Test
    public void testArrayDate(){
        int[] dates = new int[2];
        dates[0] = 19950817;
        dates[1] = 20190417;
        for (int date:dates) {
            System.out.println(date);
        }
    }

    @Test
    public void testArrayChar(){

        char[] wordsAToZ = new char[26];
        char[] wordsAndNum = new char[36];

        for(int i=0; i<wordsAToZ.length; i++)
            wordsAToZ[i] = (char) ('A'+i);

        for (char wordAToZ:wordsAToZ) {
            System.out.print(wordAToZ);
        }
        System.out.println("");

        for(int i=0; i<wordsAndNum.length; i++){
            if(i < 26) wordsAndNum[i] = (char) ('A'+i);
            else wordsAndNum[i] = (char) ('0'+ i -26);
        }

        for (char wordAndNum:wordsAndNum) {
            System.out.print(wordAndNum);
        }

    }

    @Test
    public void testString(){

        Person person = new Person();

        person.setAge(100);

        person.setName("wanghuan");

        System.out.println(person.getName());

        System.out.println(person.getAge());
    }

    @Test
    public void testBoxing(){

        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        // -128 ~ 127 true
        Integer m = -127;
        Integer n = -127;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);

    }
}