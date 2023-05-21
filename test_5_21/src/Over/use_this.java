package Over;

public class use_this {
    public static void main(String[] args) {
        Dog d1 = new Dog("wanwang",15);
        System.out.println( "Dog1 的hashcode  "+ d1.hashCode());
        d1.info();

        System.out.println();
        Dog d2 = new Dog("小黄",20);
        d2.info();
        System.out.println( "Dog2 的hashcode  "+ d2.hashCode());


    }
}

class Dog{
     String name;
     int age;
     //构造器
    public Dog(){
        this("jack",18);  //调用下面放入构造器

    }
    public Dog(int age){
        this.age = age;
    }

//没加this关键词 此时的变量皆是局部变量 并非属性
     public Dog(String name,int age){
         this.age = age;
         this.name = name;
         System.out.println("this.hashcode  "+ this.hashCode());
     }

     public void info(){
         System.out.println(name + "\t" + age + "\t");
         System.out.println("this.hashcode  "+ this.hashCode());
     }
}


class T{
    public void f1(){
        System.out.println(" f1() 的方法");
    }
    public void f2(){
       //想要调用f1 的方法
        //1.
        f1();
        //2.
        this.f1();
    }
}