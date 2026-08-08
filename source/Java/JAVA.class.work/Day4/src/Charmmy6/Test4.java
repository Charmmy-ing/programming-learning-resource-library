package Charmmy6;

class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int score;

    public void setScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("分数必须在0-100之间，输入值: " + score);
        }
        this.score = score;
    }

    public void display() {
        System.out.println("分数: " + score);
    }
}

// 测试类
public class Test4 {
    public static void main(String[] args) {
        Student stu = new Student();

        try {
            stu.setScore(85);
            stu.display();
            System.out.println("设置成功！");
        } catch (InvalidScoreException e) {
            System.out.println("异常: " + e.getMessage());
        }


        try {
            stu.setScore(120);
            stu.display();
        } catch (InvalidScoreException e) {
            System.out.println("异常: " + e.getMessage());
        }
    }
}