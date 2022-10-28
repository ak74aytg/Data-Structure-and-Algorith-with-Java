package OOPs;

public class override {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();

        Vehicle obj2 = new Vehicle();
        obj2.print();

        Car obj3 = new Car();
        obj3.print();
        obj3.print1();

        
    }
}

class Vehicle{
    void print(){
        System.out.println("Base Case");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived Case");
    }
    void print1(){
        System.out.println("2nd derived case");
    }
}
