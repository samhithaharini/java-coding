package OOPS;
// class Overloading{
//     int add(int a,int b){
//         return a+b;
//     }
//     double add(double a,double b,double c){
//         return a+b+c;
//     }
// }
// public class Polymorphism{
//     public static void main(String[] args){
//         Overloading o=new Overloading();
//         System.out.println(o.add(1,2));
//         System.out.println(o.add(9.8,8.7,3.4));
//     }
// }

class OveridingA{
    void a(){
        System.out.println("A");
    }
}
class OveridingB extends OveridingA{
    void a(){
        System.out.println("B");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        OveridingA obj=new OveridingA();
        OveridingB obj1=new OveridingB();
        OveridingA obj2=new OveridingB();
        obj.a();
        obj1.a();
        obj2.a();
    }
}