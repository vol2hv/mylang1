package com.madv.mylang.patterns.my.Prototype.scheme;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public abstract class Prototype {
    private String type;
    public Prototype (String type){
        this.type = type;
    }
    public abstract Prototype Clone();
}