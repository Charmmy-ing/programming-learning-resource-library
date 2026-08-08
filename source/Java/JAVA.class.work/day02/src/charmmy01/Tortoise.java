package charmmy01;

public class Tortoise {
    public static void main(String[] args) {
        tortoise();
    }
    public static void tortoise(){
        //假设乌龟走一段长为 100 米的上坡路，每小时向前走 4 米，又后滑 1 米，问一共要多少小时才能首次到达终点。分析：循环次数不确定，所以用 while 循环。
        int distance=0;
        int hour=0;
        while(distance<100){
            distance+=4;
            distance-=1;
            hour++;
        }
        System.out.println("乌龟首次到达终点需要"+hour+"小时。");
    }
}
