package charmmy01;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        student();
    }
    public static void student(){
        //编写程序找出两个分教最高的学生，提示输入学生的个数、每个学生的名字及其分数;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的的名字和分数：");
            names[i] = sc.nextLine();
            scores[i] = sc.nextInt();
        }
        //找到最高分和第二高分的学生
        int maxScoreIndex = 0;
        int secondMaxScoreIndex = 0;
        int maxScore = scores[0];
        int secondMaxScore = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore) {
                secondMaxScore = maxScore;
                maxScore = scores[i];
                secondMaxScoreIndex = maxScoreIndex;
                maxScoreIndex = i;
            } else if (scores[i] > secondMaxScore) {
                secondMaxScore = scores[i];
                secondMaxScoreIndex = i;
            }
        }
        System.out.println("最高分的学生是：" + (maxScoreIndex+1)+"号学生·");
        System.out.println("第二高分的学生是：" + (secondMaxScoreIndex+1)+"号学生·");
       }
       }
