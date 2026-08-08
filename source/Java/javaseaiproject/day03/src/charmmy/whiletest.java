package charmmy;

public class whiletest {
    public static void main(String[] args) {
        double peakheight=8848860;
        double i=0.1;
        int count=test(peakheight,i);
        System.out.println(count);
    }
    public static int test(double peakheight,double i){
        int count=0;
        while (i<=peakheight){
            count++;
            i*=2;

        }
        return count;
    }

}
