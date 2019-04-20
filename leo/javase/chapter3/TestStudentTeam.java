package leo.javase.chapter3;

/**
 * 组别：第十一组
 * 姓名：王欢
 * 时间：2019-4-19
 */

import leo.javase.chapter3.domain.Student;
import org.junit.Test;

public class TestStudentTeam {

    public Student[] getStudentTeam(int n){

        Student[] stuArr = new Student[n];
        //学生的ID号从1-20, 姓名:随机, 年级:随机的[1~6], 分数:随机的[0~100]整数
        String[] name1 = {"张", "李", "王", "杨", "刘", "宋"}; // 姓的素材库
        String[] name2 = {"伟", "花", "琳", "强", "丽", "芳", "兵", "欢", "阳"}; // 名的素材库
        for (int i = 0; i < stuArr.length; i++) {
            int id = i + 1;
            int randIndex1 = (int)(Math.random() * 100) % name1.length; // 产生姓的素材库的随机下标值
            int randIndex2 = (int)(Math.random() * 100) % name2.length; // 产生名的素材库的随机下标值
            String name = name1[randIndex1] + name2[randIndex2];
            int grade = (int)(Math.random() * 6 + 1);
            double score = (int)(Math.random() * 101);
            stuArr[i] = new Student(id, name, grade, score);
        }

        return stuArr;
    }

    Student[] students = getStudentTeam(100);



    @Test
    public void getBestAndWorstStudentByIndex(){

        int bestIndex =  0;
        int worstIndex = 0;

        Student[] allStudent = getStudentTeam(1000);

        for(Student student:allStudent) System.out.println(student);

        for(int i=0; i<allStudent.length; i++){

            bestIndex  = allStudent[i].getScore()>allStudent[bestIndex].getScore()?i:bestIndex;
            worstIndex = allStudent[i].getScore()<allStudent[worstIndex].getScore()?i:worstIndex;
        }

        System.out.println("最优学生id号："+(bestIndex+1));
        System.out.println("最差学生id号："+(worstIndex+1));

    }

    @Test
    public void testrollStudents(){

        Student[] students = getStudentTeam(100);

        Student temp = new Student();

        for(int i=0; i<students.length/2; i++){
            temp = students[i];
            students[i] = students[students.length-1-i];
            students[students.length-1-i] = temp;
        }

        for (Student student:students)
        System.out.println(student);
    }

    @Test
    public void testCopyArray(){}

    @Test
    public void testCopyGredeTreeToArray(){

        Student[] students = getStudentTeam(100);

        Student[] stdentsInGradeThree = new Student[100];

        int index=0;

        for(int i=0; i<students.length; i++){
            if(students[i] != null && students[i].getGrade() == 3)
            {
                stdentsInGradeThree[index] = students[i];
                index++;
            }
        }


        if(stdentsInGradeThree!=null){
            for(int i=0; i<stdentsInGradeThree.length; i++){
                System.out.println(stdentsInGradeThree[i]);
            }
        }
    }

    @Test
    public void testStudentInGradeThreeSortByBubble(){


    }
}
