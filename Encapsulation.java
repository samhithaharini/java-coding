package OOPS;

import java.util.Scanner;
class A{
    private long ac_no;
    private long mobile;
    private long ifsc_code;
    public void setter(long ac_no,long mobile,long ifsc_code){
        this.ac_no=ac_no;
        this.mobile=mobile;
        this.ifsc_code=ifsc_code;
    }
    public long getter_ac(){
        return ac_no;
    }
    public long getter_mob(){
        return mobile;
    }
    public long getter_ifsc(){
        return ifsc_code;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long ac_no=sc.nextLong();
        long mobile=sc.nextLong();
        long ifsc_code=sc.nextLong();
        A a=new A();
        a.setter(ac_no,mobile,ifsc_code);
        System.out.println("Account Number: "+ a.getter_ac());
        System.out.println("Mobile Number: "+ a.getter_mob());
        System.out.println("IFSC Code: "+ a.getter_ifsc());
    }
}

