package OOPS;
interface A{
    void name();
}
class B implements A{
    public void name(){
        System.out.println("Samhitha");
    }
}
public class PrintNameInInterface {
    public static void main(String[] args) {
        B b=new B();
        b.name();
    }    
}
