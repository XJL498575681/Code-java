package com.xjl.Enum.method;

/*
演示Enum 类的各种使用方法
 */
public class Method {
    public static void main(String[] args) {

        //枚举对象名字
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.name());
        //枚举序列  从0开始 ordinal()
        System.out.println(autumn.ordinal());

        //反编译  values
        //返回定义所有枚举对象 Season2[]
        Season2[] values = Season2.values();
        for (Season2 season:values){
            System.out.println(season);
        }

        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1 = " + autumn1 );
        System.out.println(autumn == autumn1);


        //枚举对象编号比较
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));

/*
 public final int compareTo(E o) {
        Enum<?> other = (Enum<?>)o;
        Enum<E> self = this;
        if (self.getClass() != other.getClass() && // optimization
            self.getDeclaringClass() != other.getDeclaringClass())
            throw new ClassCastException();
        return self.ordinal - other.ordinal;
    }

 */

    }
}


