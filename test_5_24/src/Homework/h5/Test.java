package Homework.h5;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker(6000,"张三") ;
        worker.print();

        Peasant peasant = new Peasant(2000, "李四");
        peasant.print();

        Teacher teacher = new Teacher(8000, "王五", 20, 50);
        teacher.print();

    }
}
