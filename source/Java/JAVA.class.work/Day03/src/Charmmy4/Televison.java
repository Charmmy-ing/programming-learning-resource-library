package Charmmy4;

public class Televison {
    /*设计一个电视机类，属性包括商品编号、开关状态、音量、频道等，同时设计一些方法对电视机的状态进行控制。例如，方法应包括开/关电视机、更换频道、提高/减小音量等。要求商品编号自动生成（可以考虑为电视机类设置一个管理商品编号的静态成员变量，或者专门设置一个编号管理类）。
注意：有些成员变量需要定义为静态的（static），控制和操纵静态成员变量的方法应是静态的（static）。
*/
    private int id;
    private boolean isOn;
    private int volume;
    private int channel;
    private static int idCount=1000;

    public Televison() {
        this(false, 0, 0);
        this.id = idCount++;
    }

    public Televison(boolean isOn, int volume, int channel) {
        this.isOn = isOn;
        this.volume = volume;
        this.channel = channel;
        this.id = idCount++;
        this.isOn = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
        if (isOn) {
            System.out.println("电视机已开启");
        } else {
            System.out.println("电视机已关闭");
        }
        System.out.println("当前音量：" + volume);
        System.out.println("当前频道：" + channel);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("当前音量：" + volume);
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("当前频道：" + channel);
    }

    @Override
    public String toString() {
        return "Televison{" +
                "id=" + id +
                ", isOn=" + isOn +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
