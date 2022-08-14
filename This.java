
class Pen{
    String color;
    String type;
        public void info(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}


public class This {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "black";
        p1.type = "Ball pen";

        Pen p2 = new Pen();
        p2.color = "Red";
        p2.type = "Gel Pen";

        p1.info();
        p2.info();
    }
}
