package Homework.h7;

import java.util.Objects;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;


    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }




    public boolean equals(Object o){
        if(this == o ){
            return true;
        }
        if(! (o instanceof Doctor)){
            return false;
        }

        Doctor doctor = (Doctor) o;
        return this.age == doctor.age && this.sal == doctor.sal
                && this.gender.equals(doctor.gender)
                && this.job.equals(doctor.job)
                && this.name.equals(doctor.name);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o)
//            eturn true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        Doctor doctor = (Doctor) o;
//        return age == doctor.age && Double.compare(doctor.sal, sal) == 0
//        && Objects.equals(name, doctor.name) &&
//        Objects.equals(job, doctor.job) &&
//        Objects.equals(gender, doctor.gender);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, job, gender, sal);
//    }



}
