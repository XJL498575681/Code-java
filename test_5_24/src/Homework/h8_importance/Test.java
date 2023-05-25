package Homework.h8_importance;

public class Test {
    public static void main(String[] args) {


        Person [] person = new Person[4];
         person[0] = new Student("学生1",'男',18,111);
         person[1] = new Student("学生2",'男',16,222);
         person[2] = new Teacher("老师1",'男',30,8);
         person[3] = new Teacher("老师2",'男',39,9);

        Test test = new Test();
        test.bubbleSort(person);

        test.print(person);

        System.out.println("------------------------");
        for (int i = 0; i < person.length; i++) {
            test.test(person[i]);
        }



    }

    public void test(Person p){
        if(p instanceof  Student){
            ((Student) p).study();
        }else if(p instanceof  Teacher){
            ((Teacher) p) .teacher();
        }else{
            System.out.println(" do nothing  ");
        }
    }



    public void bubbleSort(Person[] person){
        Person tmp =null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j <person.length - 1 -i  ; j++) {
                if(person[j].getAge() < person[j + 1].getAge()){
                    tmp =person[j];
                    person[j ] = person[j + 1];
                    person[j + 1] = tmp;
                }
            }
        }
    }

    public void print(Person[] person){
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

}
