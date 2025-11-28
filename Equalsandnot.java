package strings;
import java.util.*;
public class Equalsandnot{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String a=sc.next();
        // String b=sc.next();
        String a="sam";
        String b="sam";
        String str1=new String(a);
        String str2=new String(b);
        if(str1==str2){
            System.out.println("Equal..");
        }else{
            System.out.println("Not Equal..");
        }
        if(a==b){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
