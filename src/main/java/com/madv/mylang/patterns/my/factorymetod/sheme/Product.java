package com.madv.mylang.patterns.my.factorymetod.sheme;

/*
 *  Абстрактный продукт
 * */

import lombok.Data;
import lombok.ToString;

@Data
@ToString
abstract class Product {
    String name;  // это поле присутствует во всех подклассах этого класса
}
