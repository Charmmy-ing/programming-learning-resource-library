package Testmoviesharing;

import java.util.Scanner;

public class Outputmoives {
    //输出电影信息
    private  Movie[] movies;
    public Outputmoives(Movie[] movies) {
            this.movies = movies;
    }

    public void outputmovie () {
        //输出电影信息
        System.out.println("电影信息如下：");
        System.out.println("------------------");
            for (int i = 0; i < movies.length; i++) {
                System.out.println("电影ID：" + movies[i].getId() + "\n" + "电影名称：" + movies[i].getTitle() + "\n" + "电影价格：" + movies[i].getPrice() + "\n" + "电影导演：" + movies[i].getDirector());
            }
        }
        public void outputmovieid () {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入电影ID查询电影信息：");
            int id = sc.nextInt();
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].getId() == id) {
                    System.out.println("电影信息如下：");
                    System.out.println("------------------");
                    System.out.println("电影ID：" + movies[i].getId() + "\n" + "电影名称：" + movies[i].getTitle() + "\n" + "电影价格：" + movies[i].getPrice() + "\n" + "电影导演：" + movies[i].getDirector());
                    return;
                }
            }
            System.out.println("未查询到该电影信息");
        }
    }