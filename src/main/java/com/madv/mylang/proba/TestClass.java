package com.madv.mylang.proba;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//public class TestClass{
//    public static boolean checkList(List list, Predicate<List> p){
//        return p.test(list);
//    }
//    public static void main(String[] args) {
//        boolean b = checkList(new ArrayList(), al->al.isEmpty()); //WRITE CODE HERE
//                System.out.println(b);
//    }
//}

//class XXX{
//    public void m() {
//        throw new RuntimeException();
//    }
//}
//class YYY extends XXX{
//    public void m() throws Exception{
//        throw new Exception();
//    }
//}
//public class TestClass {
//    public static void main(String[] args) {
////        ____ obj =new__();
////        obj.m();
//    }
//}

public class TestClass {
    public Object getObject() {
        Object obj = new String("aaaaa"); //1
        Object objArr[] = new Object[1]; //2
        objArr[0] = obj; //3
        obj = null; //4
        objArr[0] = null; //5
        return obj; //6
    }

    public static void main(String[] args) {
        Object obj1 = new TestClass().getObject();
    }
}

