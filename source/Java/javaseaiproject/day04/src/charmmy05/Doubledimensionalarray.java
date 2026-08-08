package charmmy05;

public class Doubledimensionalarray {
    public static void main(String[] args) {
        testdemo();
    }
    public static void testdemo(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
