package OOPS;
abstract class Traffic{
    abstract void car();
    abstract void byk();
    void stop(){
        System.out.println("Stop");
    }
}
class Car extends Traffic{
    void car(){ 
        System.out.println("Ready to go Car");
    }
}
class Bike extends Traffic{
    void byk(){ 
        System.out.println("Ready to go Bike");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Traffic t=new Car();
        t.stop();
        t.car();
        Traffic t1=new Bike();
        t1.stop();
        t1.byk();
    }
}
