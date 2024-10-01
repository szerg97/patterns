package com.szalai.patterns.creational.abstractfactory.factory;

import com.szalai.patterns.creational.abstractfactory.chair.Chair;
import com.szalai.patterns.creational.abstractfactory.chair.VictorianChair;
import com.szalai.patterns.creational.abstractfactory.sofa.Sofa;
import com.szalai.patterns.creational.abstractfactory.sofa.VictorianSofa;
import com.szalai.patterns.creational.abstractfactory.table.Table;
import com.szalai.patterns.creational.abstractfactory.table.VictorianTable;

public class VictorianFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Creating victorian Chair");
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Creating victorian Sofa");
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        System.out.println("Creating victorian Table");
        return new VictorianTable();
    }
}
