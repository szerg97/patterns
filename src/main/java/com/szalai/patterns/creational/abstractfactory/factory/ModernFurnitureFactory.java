package com.szalai.patterns.creational.abstractfactory.factory;

import com.szalai.patterns.creational.abstractfactory.chair.Chair;
import com.szalai.patterns.creational.abstractfactory.chair.ModernChair;
import com.szalai.patterns.creational.abstractfactory.sofa.ModernSofa;
import com.szalai.patterns.creational.abstractfactory.sofa.Sofa;
import com.szalai.patterns.creational.abstractfactory.table.ModernTable;
import com.szalai.patterns.creational.abstractfactory.table.Table;

public class ModernFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Creating modern Chair");
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Creating modern Sofa");
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        System.out.println("Creating modern Table");
        return new ModernTable();
    }
}
