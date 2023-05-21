package Over;

public class OverLoad {
    public static void main(String[] args) {

        MyCalculator my =new MyCalculator();
        System.out.println(my.calculate(1,3.6));

        Methods m1 = new Methods();
        System.out.println( m1.max(1,2));;

        System.out.println( m1.max(1.3,3.5,9.2));;



        HspMethod hs = new HspMethod();
        hs.showScore("胥洁",80,78,60);

    }
}



class   HspMethod{
    public void showScore(String name,double ...score){
        double sum= 0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        System.out.println(name + "  总分是  " +sum);
    }
}
class Methods{
    public int max(int n, int n1){
        return n>n1 ? n : n1;
    }
    public double max(double a ,double b){
        return a>b ? a : b;
    }
    public double max(double a ,double b,double c){
        return  ((a>b ? a : b) > c ? (a>b ? a : b) :c);
    }

}
class MyCalculator{
    public int  calculate(int x,int y){
        return(x + y);
    }
    public double calculate(int x,double y){
        return(x + y);
    }
    public double calculate(double x,double y){
        return(x + y);
    }
    public int  calculate(int x,int y,int z){
        return(x + y+ z);
    }
}