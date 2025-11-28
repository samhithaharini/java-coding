package constructors;
class A{
    int n;
    A(int n){
        this.n=n;
    }
    A(A in){
        n=in.n;
    }
    void display(){
        System.out.println(n);
    }
}
public class Copy {
    public static void main(String[] args) {
        A a =new A(10);
        A copy=new A(a);
        a.display();
        copy.display();
    }
}
