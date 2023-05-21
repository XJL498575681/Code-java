package Over;

public class varScope {
    public static void main(String[] args) {
        Person p1 =  new Person();
        p1.say();

    }
}



class Person{
    String name  = "jack";


    public void say(){
        String name = "king";
        System.out.println("say() name = ");
    }
}