public class TestingFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed("Fast");
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed("Medium");
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}