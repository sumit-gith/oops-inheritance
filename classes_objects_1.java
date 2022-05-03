class classes_objects_1 {
    double width, height, depth;
    classes_objects_1(double w, double h, double d) {
        height = h;
        width = w;
        depth = d;
    }

    public double volume() {
        return width*height*depth;
    }
}
class Solution {
    public static void main(String[] args) {
        classes_objects_1 b = new classes_objects_1(10, 20, 30);
        System.out.println("Volume of the box is: " + b.volume());
    }
}
