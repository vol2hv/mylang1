package com.madv.mylang.proba;

import java.util.Arrays;
import java.util.List;

public class Data {
    int value;
    Object a1;



    Data(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        Data[] dataArr = new Data[]
                {new Data(1), new Data(2), new Data(3), new Data(4)};

        List<Data> dataList = Arrays.asList(dataArr); //1
//        for (Data element : dataList) {
//            dataList.remove((Data d) -> {
//                return d.value % 2 == 0;
//            }); //2
//            System.out.println("Removed “+d+", ");  //3
//        }
    }
}
