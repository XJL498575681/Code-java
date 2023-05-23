package com.ploy.Array;

public class PloyArray {
    public static void main(String[] args) {
        Person [] person = new Person[5];
        person[0] = new Person("jack",10);
        person[1] = new Student("jak",19,90);

        person[2] = new Student("luci",179,76);
        person[3] = new Teacher("davi",38,9000);
        person[4] = new Teacher("ani",40,9000);


        for (int i = 0; i < person.length; i++) {
            // 动态绑定机制  编译是person类型 每个数组元素运行是根据实际创建的不同对象
            System.out.println(person[i].say());
            if(person[i] instanceof Student){
                Student student = (Student) person[i];//下转型
                student.study();
            }else if(person[i] instanceof Teacher){
                Teacher teacher = (Teacher) person[i];//下转型
                teacher.teacher();
            }else if(person[i] instanceof Person){

            } else{
                System.out.println("类型有误");
            }
        }

    }
}
