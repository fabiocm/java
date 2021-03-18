package com.gildedrose;

public class Normal implements IOperations{
    public Normal(){

    }
    @Override
    public Item runOperation(Item i){
        return i;
    }
}