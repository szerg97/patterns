package com.szalai.patterns.creational.abstractfactory.factory;

import com.szalai.patterns.creational.abstractfactory.chair.Chair;
import com.szalai.patterns.creational.abstractfactory.sofa.Sofa;
import com.szalai.patterns.creational.abstractfactory.table.Table;

public abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Sofa createSofa();
    public abstract Table createTable();
}
