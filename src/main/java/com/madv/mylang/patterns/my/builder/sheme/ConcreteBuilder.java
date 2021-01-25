package com.madv.mylang.patterns.my.builder.sheme;


public class ConcreteBuilder extends Builder {
    Product product = new Product();

    @Override
    public void BuildPartA() {
        product.Add("Part A");
    }

    @Override
    public void BuildPartB() {
        product.Add("Part B");
    }

    @Override
    public void BuildPartC() {
        product.Add("Part C");
    }

    @Override
    public Product GetResult() {
        return product;
    }

}
