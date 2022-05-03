public class classes_objects_2 {
    public static int powerInt(int num, int power) {
        int res = 1;
        for(int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }
    public static double powerDouble(double num,int power) {
        double res = 1;
        for(int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }
}

class Calc {
    public static void main(String[] args) {
        System.out.println("Value of 2^10 : " + classes_objects_2.powerInt(2, 10));
        System.out.println("Value of 3.14^10 : " + classes_objects_2.powerDouble(3.14, 10));
    }
}
