package com.madv.mylang.proba;

interface Account{
    public default String getId(){
        return "0000";
    }
}
interface PremiumAccount extends Account{
    String getId();
}
class A{}
class B extends A{}
class C extends B{}

class X{
    B getB() {return new B();}
}
class Y extends X{
//    protected B getB(){return new C();}
//    C getB(){return new C();}
// -   public C getB(){return new B();}
//  -  A getB(){return new A();}
}

public class Qqq {

    void m1() {
//  +      int a,b,c;a=b=c=100;
//    int a,b, c=100;
//    int a=100=b=c;
//    int a=b=c=100;
//  +  int a=100,b, c;
    }
}
