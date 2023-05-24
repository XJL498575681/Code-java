package Homework.h2;

public class teacher {
    private String name;
    private int age;
    private String post;
    private double sal;
    private double grade;

    public teacher(String name, int age, String post, double sal, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.sal = sal;
        this.grade = grade;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce(){
        System.out.println("姓名\t" +getName() +"年龄\t"+ getAge()
        +"职称\t" + getPost()+ "工资\t" + getSal() + "级别" + getGrade());
    }
}



class Professor extends teacher{
    public Professor(String name, int age, String post, double sal, double grade) {
        super(name, age, post, sal, grade);
    }

    @Override
    public void introduce() {
        System.out.println("教授");
        super.introduce();
    }
}

