package Homework.h8_importance;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public void teacher(){
        System.out.println(  getName() + "会好好教书");
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String play() {
        return super.play() + "\t 象棋";
    }

    @Override
    public String info() {
        return "老师的信息、\n"+super.info() + "\n工龄" + getWork_age();
    }
    public void printInfo(){
        System.out.println("老师的信息");
        System.out.println(super.info());
        System.out.println("工龄" + getWork_age());
        teacher();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}'+ super.toString();
    }
}
