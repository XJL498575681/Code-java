package com.Super;

public class B  extends A {

    public int n1 = 900;

    public  void n1(){
        System.out.println(n1);   // 900  子类自己的
        System.out.println(this.n1);// 900  子类自己的
        System.out.println(super.n1);// 100  直接调用父类的
    }
      public void hi(){
          //属性     n4 private 不可以 super. 调用
          System.out.println(super.n1 + super.n2 + super.n3 );
      }

      //方法
    public void ok(){
          super.test100();
          super.test200();
          super.test300();
          // test 400  private
    }

    public void sum(){
        System.out.println("B类的sum");
        //1  先找子类 子类没有找父类 直至Object
        cal();
        //2.  等价于 cal()
        this.cal();
        //3.super 直接从父类查找
        super.cal();

    }

    //super  只能放在构造器里 且只能出现在第一句

    public B(){
           //默认 super（） 父类的无参构造器
         super("jack",10);
        //  super("jack");   指定调用父类的构造器
    }
}
