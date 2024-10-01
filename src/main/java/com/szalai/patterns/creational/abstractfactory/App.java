package com.szalai.patterns.creational.abstractfactory;

import com.szalai.patterns.creational.abstractfactory.chair.Chair;
import com.szalai.patterns.creational.abstractfactory.factory.FurnitureFactory;
import com.szalai.patterns.creational.abstractfactory.factory.ModernFurnitureFactory;
import com.szalai.patterns.creational.abstractfactory.factory.VictorianFurnitureFactory;
import com.szalai.patterns.creational.abstractfactory.sofa.Sofa;
import com.szalai.patterns.creational.abstractfactory.table.Table;

public class App {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        writeChair(factory.createChair());
        writeSofa(factory.createSofa());
        writeTable(factory.createTable());

        factory = new VictorianFurnitureFactory();

        writeChair(factory.createChair());
        writeSofa(factory.createSofa());
        writeTable(factory.createTable());
    }

    private static void writeChair(Chair chair) {
        System.out.printf("Chair: %s%n", chair);
    }

    private static void writeSofa(Sofa sofa) {
        System.out.printf("Sofa: %s%n", sofa);
    }

    private static void writeTable(Table table) {
        System.out.printf("Table: %s%n", table);
    }
}
