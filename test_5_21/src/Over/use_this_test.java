package Over;

public class use_this_test {
    public static void main(String[] args) {

        Person1 p1 = new Person1("marry",20);
        Person1 p2 = new Person1("smith",10);

        System.out.println(p1.compareTo(p2));
    }
}

class Person1{
    String name;
    int age;
    public Person1 (String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person1 p){
        return this.name.equals(p.name) && this.age == p.age;
    }

}
