public class Rectangle {
    private double height;
    private double width;
    private String color;
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Rectangle(double width,double height,String color){
        this.setColor(color);
        this.setHeight(height);
        this.setWidth(width);
    }
    public void getArea(){
        double area=0;
        area=this.height*this.width;
        System.out.println("矩形的面积为:"+area);
    }

    private void getLength() {
        double length = 0;
        length = (height + width) * 2;
        System.out.println("矩阵的周长为："+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rec=new Rectangle(3, 4, "红色");
        rec.getArea();
        rec.getLength();
        System.out.println(rec.toString());
    }


}