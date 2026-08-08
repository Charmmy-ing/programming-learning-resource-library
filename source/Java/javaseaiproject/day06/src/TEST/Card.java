package TEST;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data//自动实现getter和setter方法
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    //lombok可以自动为类实现getter和setter方法，无参构造器 和toString方法
    private String numberID;
    private String suitName;
    private int phone;
    private double money;

    //预存金额；
    public void deposit(double money) {

        this.money += money;
    }

    //消费金额
    public void consume(double money) {
        this.money -= money;
    }
}