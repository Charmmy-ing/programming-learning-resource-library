package charmmyy;

public class Test {
    public static void main(String[] args) {
        Consultant consultant = new Consultant();
        consultant.setHuman(100);
        System.out.println(consultant.getHuman());
        Teachaes t1 = new Teachaes();
        t1.setSkill("教学");
        System.out.println(t1.getSkill());
        t1.setName("张三");
        System.out.println(t1.getName());
        t1.setSex("男");
        System.out.println(t1.getSex());
    }
}
