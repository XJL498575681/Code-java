package Homework.h8_importance;

public class Student extends Person{
    private int stu_id;

    public Student(String name, char gender, int age, int stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println( getName() + " 会好好学习 ");
    }

    @Override
    public String play() {
        return super.play() + "\t 足球 ";
    }


    public void printInfo(){
        System.out.println("学生的信息");
        System.out.println(super.info());
        System.out.println("学号" + getStu_id());
        study();
        System.out.println(play());
    }


    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                '}' + super.toString();
    }
}
