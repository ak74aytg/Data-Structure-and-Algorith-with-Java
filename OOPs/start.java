package OOPs;

public class start {
    public static void main(String[] args) {
        Pen p1 = new Pen("Red", 2);
        System.out.println(p1.getColor());
        System.out.println(p1.tip);
        
        Pen p2 = new Pen(p1);
        p2.tip = 4;
        p1.setColor("black");
        System.out.println(p2.getColor());
        System.out.println(p2.tip);
      
        
    }
}

class Pen{
    private String color;
    public int tip;

    Pen(String color, int tip){
        this.color = color;
        this.tip = tip;
    }

    Pen(Pen p1){
        this.color = p1.color;
    }

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}
