package OOPS;
interface A{
    void fun();
}
class B implements A{
    public void fun(){
        System.out.println("Interace Works..");
    }
}
public class Interface {
    public static void main(String[] args) {
        B b=new B();
        b.fun();
    }
}
