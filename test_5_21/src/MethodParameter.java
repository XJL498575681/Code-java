
//传值  传址
public class MethodParameter {
    public static void main (String[] args){

        AA a = new AA();
        int x= 1;
        int y = 2;
        a.swap(x,y);
        System.out.println("a= " + x + " b = " + y);

        B b =new B();
        int[] arr = {1,2,3};
        b.test(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 10;

        Person_revise pr = new Person_revise();
        pr.test(p1);
        System.out.println(p1.age);


        Person p3 = new Person();
        p3.name = "李四";
        p3.age = 20;


        Person_copy  pCopy = new Person_copy();
        Person p4 = pCopy.copyPerson(p3);
        System.out.println( p4.age +"  "+ p4.name);


        T t = new T();
        int t1 = t.fibonacci(7);
        System.out.println(t1);



        Peach pe = new Peach();
        int day = pe.plan_peach(1);
        System.out.println(day);

    }
}
class Peach{
    public int plan_peach(int day){
        if(day == 10){
            return 1;
        }else if(day >= 1 && day <= 9){
            return (plan_peach(day + 1) + 1) * 2;
        }else{
            System.out.println("天数不对");
            return -1;
        }
    }
}


class T{
    public int fibonacci(int n){
        if( n >= 1){
            if(n == 1 || n ==2){
                return 1;
            }else{
                return fibonacci(n -1) + fibonacci(n - 2);
            }
        }else{
            return -1;
        }
    }
}

class Person{
         String name;
         int age;
}
class Person_copy{
    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.age = p.age;
        p2.name = p.name;
        return p2;
    }
}

class Person_revise{
    public void test(Person p){
        p.age = 10000;
    }
}


class AA{
    public void swap(int a,int b){
        System.out.println("a= " + a + " b = " + b);
        int tmp= a;
        a = b;
        b= tmp;
        System.out.println("a= " + a + " b = " + b);
    }
}

class B{
    public void test(int [] arr){
        arr[0] = 100;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}