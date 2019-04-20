package leo.javase.chapter3;

import leo.javase.chapter3.domain.*;

import org.junit.Test;

import java.sql.SQLOutput;


public class TestClass {

    public int[] getIntArry(int n) {

        int[] intArry = new int[n];
        for (int i = 0; i < intArry.length; i++)
            intArry[i] = (int) (Math.random() * 100);
        return intArry;
    }

    public void changerGender(Teacher teacher) {
        teacher.setAge(18);
    }

    @Test
    public void testObjectParam() {


        Teacher teacher = new Teacher("马萍", "女", 24, new Computer(8, 64));
        changerGender(teacher);
        System.out.println(teacher.getAge());
    }

    @Test
    public void testRunChicken() {

        Phone phone = new Phone("Android", "1920x1080");

        Person person = new Person("王欢", 24);

        person.runChicken(phone);
    }

    @Test
    public void testCreateArray() {
        int[] intArrays;
        //声明了一个int数组
        intArrays = new int[5];
        //创建数组：使用new关键字 中括号内数字表示元素个数
        intArrays[0] = 11;
        intArrays[1] = 22;
        intArrays[2] = 33;
        intArrays[3] = 44;
        intArrays[4] = 55;
        for (int intArray : intArrays) {
            System.out.println(intArray);
        }
    }

    @Test
    public void testArrayDate() {
        int[] dates = new int[2];
        dates[0] = 19950817;
        dates[1] = 20190417;
        for (int date : dates) {
            System.out.println(date);
        }
    }

    @Test
    public void testArrayChar() {

        char[] wordsAToZ = new char[26];
        char[] wordsAndNum = new char[36];

        for (int i = 0; i < wordsAToZ.length; i++)
            wordsAToZ[i] = (char) ('A' + i);

        for (char wordAToZ : wordsAToZ) {
            System.out.print(wordAToZ);
        }
        System.out.println("");

        for (int i = 0; i < wordsAndNum.length; i++) {
            if (i < 26) wordsAndNum[i] = (char) ('A' + i);
            else wordsAndNum[i] = (char) ('0' + i - 26);
        }

        for (char wordAndNum : wordsAndNum) {
            System.out.print(wordAndNum);
        }

    }

    @Test
    public void testString() {

        Person person = new Person();

        person.setAge(100);

        person.setName("wanghuan");

        System.out.println(person.getName());

        System.out.println(person.getAge());
    }

    @Test
    public void testBoxing() {

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

    @Test
    public void testTransObject() {

        Teacher teacher = new Teacher();
        teacher.setAge(24);
        teacher.setName("王欢");
        teacher.setGender("男");

        Computer computer = new Computer(4, 20);

        teacher.setComputer(computer);

        System.out.println(teacher);

    }

    @Test
    public void testPersonWithPhone() {

        Phone phone = new Phone("Android", "2K");
        PersonWithPhone personWithPhone = new PersonWithPhone("wanghuan", 24, phone);
        System.out.println(personWithPhone);
    }

    @Test
    public void testRandomBetween20And70() {

        int random;
        for (int i = 0; i < 10000; i++) {
            random = 20 + (int) (50 * Math.random());
            System.out.println(random);
        }
    }

    @Test
    public void testArrayAvgSumCount() {

        int avg = 0;
        int sum = 0;
        int count = 0;
        int max = 0;
        int min = 0;

        int intArry[] = {1, 3, 5, 7, 9};

        for (int i : intArry) {
            sum += i;
            //   count++;
        }

        count = intArry.length;

        avg = sum / count;

        //整数相除保留整数
        System.out.println("元素个数：" + count);        //整数相除保留整数
        System.out.println("总和值：" + sum);        //整数相除保留整数
        System.out.println("平均值：" + avg);


        for (int i = 0; i < intArry.length; i++) {

            if (i == 0) {
                min = intArry[i];
                max = intArry[i];
            }

            if (intArry[i] > max) max = intArry[i];
            else if (intArry[i] < min) min = intArry[i];
        }

        System.out.println("最大值:" + max);
        System.out.println("最小值:" + min);


    }

    @Test
    public void testMaxNumberDeliBySeven() {

        int maxDeliSeven = 0x0FFFFFFF;
        boolean flag = true;

        while (flag) {

            if (maxDeliSeven % 7 == 0) flag = false;
            else maxDeliSeven--;
        }

        System.out.println("能被7整除的最大整数是" + maxDeliSeven);
    }

    @Test
    public void testFindMaxNumberByIndex() {

        int[] intArry = getIntArry(10);

        int maxIndex = 0;
        int minIndex = 0;


        for (int i = 0; i < intArry.length; i++) {
            System.out.print(" " + intArry[i]);
            if (intArry[i] < intArry[maxIndex])
                maxIndex = i;
            else if (intArry[i] > intArry[minIndex])
                minIndex = i;
        }

        System.out.println("\n最大值序号：" + maxIndex);
        System.out.println("最小值序号：" + minIndex);
    }

    @Test
    public void testArraySort() {

        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] intArrayDouble = new int[10];

        //记录已存放数组的最大下标
        int index = 0;

        //遍历原数组
        for (int i : Array) {
            if (i % 2 == 0) {
                intArrayDouble[index] = i;
                index++;
            }
        }
        for(int i=0; i<index ; i++){
            System.out.println(intArrayDouble[i]);
        }
    }
}