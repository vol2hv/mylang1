package com.madv.mylang.proba;

import java.util.ArrayList;
import java.util.function.Predicate;

class Data1 {
    int value;

    Data1(int value) {
        this.value = value;
    }
}

public class TestData {
    public static void printUsefulData(ArrayList<Data1> dataList, Predicate<Data1> p) {
        for (Data1 d : dataList) {
            if (p.test(d)) {
                System.out.println(d.value);
            };
        }
    }

    public static void main(String[] args) {
        ArrayList<Data1> al = new ArrayList<>();
        al.add(new Data1(1));
        al.add(new Data1(2));
        al.add(new Data1(3));
//        printUsefulData(al, (Data1 d)-> { return d.value>2; } );
        printUsefulData(al, d->d.value >2 );
//        printUsefulData(al,Data1 d->d.value>2 );

    }
}
/*

    A printUsefulData(al, (Data d)-> { return dvalue>2; } );
        B | printUsefuData(al > avalue>2;
        | © | printuseruibatatal, (¢)> return dvalue>2;
        D__ printUsefulData(al, d-> d.value>2 );
        E _ printUsefulData(al, Data d-> dvalue>2 );
*/

/*

        and the following code fragments:
public void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p}{

        if(p.test(d)) System out printin(d.value),
        )
        )
        ArrayList<Data> al new AraylisteData>()
        aladd(new Data(1)).al.add(new Data(2));al add(new Data(3));
        (INSERT METHOD CALL HERE
        \Which ofthe following options can be inserted above so that wl print 3?
        A printUsefulData(al, (Data d)-> { return dvalue>2; } );
        B | printUsefuData(al > avalue>2;
        | © | printuseruibatatal, (¢)> return dvalue>2;
        D__ printUsefulData(al, d-> d.value>2 );
        E _ printUsefulData(al, Data d-> dvalue>2 );
*/
