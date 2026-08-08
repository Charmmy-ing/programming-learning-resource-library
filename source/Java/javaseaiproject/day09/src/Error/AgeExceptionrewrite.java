package Error;

public class AgeExceptionrewrite extends RuntimeException
{

    //无参构造方法
    public AgeExceptionrewrite() {
    }
    //重写exception里的构造方法
    public AgeExceptionrewrite(String message) {
        super(message);
    }
}
