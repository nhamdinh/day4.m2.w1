import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void enterData() {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter A = ");
        a = data.nextInt();
        System.out.print("Enter B = ");
        b = data.nextInt();
        System.out.print("Enter C = ");
        c = data.nextInt();
    }

    public double getDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }


    public double getRoot1() {
        return (-b + Math.sqrt(getDelta())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDelta())) / (2 * a);
    }

    public void showResult() {
        try {
            if (getDelta() < 0) {
                System.out.println("The equation has no roots!");
            } else if (getDelta() == 0) {
                System.out.println("Root 1 = Root 2 = " + getRoot1());
            } else
                System.out.println("Root 1 = " + getRoot1() + ", Root 2 = " + getRoot2());
        } catch (Exception e) {
            System.err.println("error!!!");
        }
    }

}