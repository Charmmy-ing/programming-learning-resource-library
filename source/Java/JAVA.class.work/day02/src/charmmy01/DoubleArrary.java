package charmmy01;

import java.util.Scanner;

public class DoubleArrary {
    public static void main(String[] args) {
        num();
    }
    //编写一个程序，将二维数组a转置后存入数组b（所谓转置就是行列互换）
    public static void num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入二维数组a的行数：");
        int row = sc.nextInt();
        System.out.println("请输入二维数组a的列数：");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        System.out.println("请输入二维数组a的元素：");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                b[i][j] = a[j][i];
            }
        }
        System.out.println("转置后的二维数组b为：");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
