package Homework.h7;

public class RTest {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack", 20, "老师", "男", 9000);
        Doctor doctor2 = new Doctor("jack", 00, "老师", "男", 9000);

        System.out.println(doctor.equals(doctor2));
    }
}
