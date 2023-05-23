package com.ploy.exercise1;

public class test {
    public static void main(String[] args) {

        worker tom = new worker("tom", 2599);
        Manager anni = new Manager("anni", 9000, 700);

        test t1 = new test();
        t1.show(tom);
        t1.testWork(tom);
        t1.show(anni);
        t1.testWork(anni);
    }



    public void show(Employee employee){
        System.out.println(employee.getAnnual());
    }

    public void testWork(Employee e){
        if(e instanceof worker){
            worker worker1 = (worker) e;
            worker1.work();
        }else if (e instanceof Manager){
            Manager manager =(Manager) e;
            manager.manger();
        }else if (e instanceof Employee){

        }else{
            System.out.println("信息有误");
        }
    }

}
