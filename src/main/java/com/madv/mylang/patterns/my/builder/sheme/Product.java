package com.madv.mylang.patterns.my.builder.sheme;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Product
{
    List<Object> parts = new ArrayList<>();
    public void Add(String part)
    {
        parts.add(part);
    }
}