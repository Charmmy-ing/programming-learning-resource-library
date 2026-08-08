package test;

public class washtest {
    //    开发一个简易的斗地主游戏，只完成做牌和洗牌
    public static void main(String[] args) {
        start();
    }

    public static void start() {
//        动态存储54张牌；
        String[] cards = new String[54];
        //花色
        String[] suits = {"♠", "♥", "♣", "♦"};
        //牌面
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //牌的索引
        int index = 0;
//        存牌
        for (int i = 0; i < 52; i++) {
            cards[index] = suits[i % 4] + ranks[i % 13];
            index++;
        }
        cards[index] = "Joker0";
        index++;
        cards[index] = "Joker1";
        for (int i = 0; i < 54; i++) {
            System.out.print(cards[i]+" ");
        }

        System.out.println("\n"+"存牌结束");
//        开始洗牌
        System.out.println("\n"+"洗牌开始");
//        交换任意索引位置的牌
        for (int i = 0; i < 54; i++) {
            int j = (int)(Math.random()*54);
            int k = (int)(Math.random()*54);
                String temp = cards[j];
                cards[j] = cards[k];
                cards[k] = temp;
        }
        for (int i = 0; i < 54; i++) {
            System.out.print(cards[i]+" ");
        }
        System.out.println("\n"+"洗牌结束");

    }

}
