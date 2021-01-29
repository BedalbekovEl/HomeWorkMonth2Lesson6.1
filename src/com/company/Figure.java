package com.company;

public class Figure<T extends Number, S extends Number, D extends Number> implements Calculable {
    private T a;
    private S b;
    private D c;

    public Figure(T a, S b, D c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public S getB() {
        return b;
    }

    public D getC() {
        return c;
    }

    @Override
    public Number areaCalculation() {
        return a.doubleValue() * b.doubleValue() * c.doubleValue();
    }

    @Override
    public double perimetr() {
        return (a.doubleValue() + b.doubleValue() + c.doubleValue());
    }



}

