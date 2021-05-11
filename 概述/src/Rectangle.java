public class Rectangle {
    private float width,height;
    private String color;
    public Rectangle(float width, float height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public float getWidth() {
        return width;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public  float getArea(float width, float height) {
        float area = 0;
        area = width*height;
        return area;
    }
    public  float getLength(float width, float height) {
        float length = 0;
        length = 2 *(width+height);
        return length;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8,"red");
        System.out.println(rectangle.getWidth());
        rectangle.setColor("blue");
        System.out.println(rectangle.getArea(5,4));
        System.out.println(rectangle.getLength(2,6));
    }
}
