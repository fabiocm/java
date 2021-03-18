package com.gildedrose;

public class Operations {
    private IOperations strategy;

    public Operations (IOperations strategy) {
        this.strategy = strategy;
    }
    public Item procesar(Item i){
        return strategy.runOperation(i);
    }
}
