package capsulation;

public class Student {
    private int age;
    public void setAge(int age) {
        if(age>0&&age<100){
            this.age = age;
        }else{
            System.out.println("年龄不能小于0或大于等于100");
        }
    }
    public int getAge(){
        return age;
    }
}
