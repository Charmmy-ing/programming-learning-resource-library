package TEST;

public class GoldCard extends Card {
    public void consume(double money) {
        System.out.println("Gold card consumed money: " + money);
        System.out.println("Save consumed money: " + (money*0.8));
        setMoney(getMoney()-money*0.8);
        //打印洗车票；
        if (money*0.8>200)
        {
            printTicket();
        }else
        {
            System.out.println("你当前消费不满200元，不能打印洗车票");
        }
    }
    public void printTicket() {
        System.out.println("You have a ticket");

    }
}
