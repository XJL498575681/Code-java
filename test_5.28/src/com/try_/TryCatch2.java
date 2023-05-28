package com.try_;

public class TryCatch2 {
    public static void main(String[] args) {

        try {
            Person person = new Person();
            person= null;

            System.out.println(person.getPerson());
            int n1 = 10;
            int n2 = 0;
           // int res = n1 / n2;
        } catch (NullPointerException e){
            System.out.println("空指针异常" + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("算数异常" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("1");
        }

    }
}


class Person{

    public Person getPerson(){
        return new Person();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

