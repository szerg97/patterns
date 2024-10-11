package com.szalai.patterns.solution;

public class ConcreteAdapterVisitor implements AdapterVisitor {
    @Override
    public void visit(PenAdapter pen) {
        System.out.println("Visiting PenAdapter...");
        System.out.println(pen.getPen().getBrand());
        System.out.println(pen.getPen().getColor());
    }

    @Override
    public void visit(RulerAdapter ruler) {
        System.out.println("Visiting RulerAdapter...");
        System.out.println(ruler.getRuler().getBrand());
        System.out.println(ruler.getRuler().getSize());
    }
}
