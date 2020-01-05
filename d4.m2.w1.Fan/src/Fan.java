public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = 1;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public String getSpeedLevel() {
        if (this.speed == 1) {
            return "Slow";
        } else if (this.speed == 2) {
            return "Medium";
        } else return "Fast";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpeed(String speed) {
        if (speed.equalsIgnoreCase("Slow")) {
            this.speed = 1;
        } else if (speed.equalsIgnoreCase("Medium")) {
            this.speed = 2;
        } else if (speed.equalsIgnoreCase("Fast")) {
            this.speed = 3;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Fan is on, speed: " + this.getSpeedLevel() + ", color: " + this.getColor() + ", radius: " + this.getRadius();
        } else return "Fan is off, color: " + this.getColor() + ", radius: " + this.getRadius();
    }
}