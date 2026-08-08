package test;

public class Doublegame {
    public static void main(String[] args) {
        testdemo(4);
    }
    public static void testdemo(int n){
//      四个数每行
        int[][] arr = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = count++;
            }
        }
        print(arr);
        disorganise(arr);
        print(arr);
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void disorganise(int[][] arr){
            for (int j = 0; j < arr.length*arr[0].length; j++) {
                int row = (int) (Math.random() * arr.length);
                int count = (int) (Math.random() * arr[row].length);
                int row2 = (int) (Math.random() * arr.length);
                int count2 = (int) (Math.random() * arr[row].length);
//随机两个数交换位置
                int temp = arr[row][count];
                arr[row][count] = arr[row2][count2];
                arr[row2][count2] = temp;
            }
        }
}
