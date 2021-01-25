package com.madv.mylang.patterns.my.strategy.scheme;

public class Context
{
    private Strategy contextStrategy ;

    public Context(Strategy strategy)
    {
        this.contextStrategy = strategy;
    }

    public void ExecuteAlgorithm()
    {
        contextStrategy.Algorithm();
    }
}
