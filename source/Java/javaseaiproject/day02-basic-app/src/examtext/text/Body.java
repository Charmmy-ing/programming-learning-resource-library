package examtext.text;

public class Body {
    //新建一个类，用来存身体的属性
    //隐藏数据
    private Double weight;
    private Double height;
    private Double age;
    private String name;
    //新建一个放法来暴露数据；
    public void setBody(Double weight, Double height, Double age, String name) {
        if (weight < 0 &&weight>300 || height < 0&&height>300 || age < 0&&age>120 || name == null) {
            System.out.println("输入错误");
            return;
        }else
        {
            this.weight = weight;
        this.height = height;
        this.age = age;
        this.name = name;
        }
    }
}
