package TEST;

public class SCard extends Card {
    //银卡
    public void consume(double money) {
        System.out.println("SCard consumed money: " + money);
        System.out.println("Save consumed money: " + (money*0.9));
        setMoney(getMoney()-money*0.9);
    }
   }
