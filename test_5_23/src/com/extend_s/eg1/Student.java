package com.extend_s.eg1;

class Student extends Person {
    String major;

    public Student() {
        super("smith",10);
        //此时隐藏了一句话 super();
        //当调用时默认调用了父类的空参构造器
        System.out.println("Student 子类  的构造器");
    }

    public Student(String name, int age, String major) {
        super("smith",10);
        this.major = major;
    }

    public void study() {
        System.out.println("Student are studying");
    }


}
