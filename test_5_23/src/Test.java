import com.x.Dog;
//import  的解析引用
public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1);

        com.j.Dog dog2 = new com.j.Dog();
        System.out.println(dog2);

        B b = new B();

    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
       // super();  默认继承父类的无参构造器
        System.out.println("a.name");
    }
}


class B extends A{
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        System.out.println("b.name");
    }
}