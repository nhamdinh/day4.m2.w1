import java.util.Scanner;

class Rectangle {
    private int width, height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void Area() {
        double area;
        area = height * width;
        System.out.println("Area of your rectangle is: " + area);
    }

    public void Perimeter() {
        double perimeter;
        perimeter = (width + height) * 2;
        System.out.println("Perimeter of your rectangle is: " + perimeter);
    }
    public void enterData() {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter your rectangle: ");
        System.out.print("Width = ");
        width = data.nextInt();
        System.out.print("Height = ");
        height = data.nextInt();
    }

    public void Display() {
        System.out.println("Your rectangle: width = " + width + ", height = " + height);
        ;
    }


}
