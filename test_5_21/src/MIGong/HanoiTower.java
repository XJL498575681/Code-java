package MIGong;

//num 表示移动的个数 a b c 分别表示 a b c 塔
public class HanoiTower {
    public static void main(String[] args) {
        Tower t = new Tower();
        t.move(3,'a','b','c');

    }
}

class Tower{
    public void move(int num,char a,char b, char c){
        if(num == 1){
            System.out.println(a + "->" +c);
        }else{
            //将上面所有盘移到b,借助c
            move(num-1,a,c,b);
            //把最下面的盘移动到c
            System.out.println( a + "->"+ c);

            //b的所有盘移动到c，借助a
            move(num- 1,b,a,c);

        }

    }
}