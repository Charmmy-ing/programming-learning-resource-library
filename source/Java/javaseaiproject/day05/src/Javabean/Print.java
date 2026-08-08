package Javabean;

public class Print {

    private Student s;
    public Print(Student s) {
        this.s = s;
    }
    public void print() {
        System.out.println(s.getName()+s.getChinese()+s.getMath()+s.getEnglish());
    }
}