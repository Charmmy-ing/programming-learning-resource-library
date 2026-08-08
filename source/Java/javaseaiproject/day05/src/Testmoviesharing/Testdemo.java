package Testmoviesharing;

public class Testdemo {
    //目标完成面向对象任务；
    //每个对象都是一部电影类对象
    public static void main(String[] args) {
        Movie[] movies = new Movie[6];
        //存储电影对象
        movies[0] = new Movie(1, "星际穿越",30 , "斯皮尔伯格");
        movies[1] = new Movie(2, "速度与激情", 20, "兰克·德兰克·德米诺斯");
        movies[2] = new Movie(3, "千与千寻", 29, "宫崎骏");
        movies[3] = new Movie(4, "夏洛特烦恼", 10, "沈腾");
        movies[4] = new Movie(5, "流浪地球", 26, "吴京");
        movies[5] = new Movie(6, "让子弹飞", 23, "姜文");
        Outputmoives mo=new Outputmoives(movies);
        //输出电影信息
        mo.outputmovie();
        //根据电影ID查询电影信息
        mo.outputmovieid();
    }
}
