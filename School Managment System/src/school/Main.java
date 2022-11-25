package school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Lizzy=new Teacher(1,"Lizzy",500);
        Teacher Mellisa=new Teacher(2,"Mellisa",700);
        Teacher Jack=new Teacher(3,"Jack",600);
        List<Teacher> teacherList=new ArrayList<>();
    teacherList.add(Lizzy);
    teacherList.add(Mellisa);
    teacherList.add(Jack);
        Student Malik=new Student(1,"Malik",4);
        Student Reshad=new Student(2,"Reshad",12);
        Student Ali=new Student(3,"Ali",5);
        List<Student> studentList=new ArrayList<>();
        studentList.add(Malik);
        studentList.add(Reshad);
        studentList.add(Ali);



        School gha=new School(teacherList,studentList);

        Teacher Megan=new Teacher(6,"Megan",900);
        gha.addTeacher(Megan);

        Malik.payFees(5000);
        Reshad.payFees(6000);
        System.out.println("GHA has earned $"+gha.getTotalMoneyEarned());

        System.out.println("----Making GHA PAY SALARY-----");
        Lizzy.receiveSalary(Lizzy.getSalary());
        System.out.println("GHA has spent for the salary to  "+Lizzy.getName()+" and now has $"+gha.getTotalMoneyEarned());
        Mellisa.receiveSalary(Mellisa.getSalary());
        System.out.println("GHA has spent for the salary to  "+Mellisa.getName()+" and now has $"+gha.getTotalMoneyEarned());
        Jack.receiveSalary(Jack.getSalary());
        System.out.println("GHA has spent for the salary to  "+Jack.getName()+" and now has $"+gha.getTotalMoneyEarned());


        System.out.println(Reshad);
        System.out.println(Jack);
    }
}
