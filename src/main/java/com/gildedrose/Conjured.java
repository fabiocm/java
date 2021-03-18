package com.gildedrose;

public class Conjured implements IOperations{
    public Conjured(){

    }
    @Override
    public Item runOperation(Item i){
        return i;
    }
}