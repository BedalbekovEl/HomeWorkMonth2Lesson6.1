package com.company;

public class Main {

    public static void main(String[] args) {
        Figure<Float, Integer, Double> triangle1 = new Figure<>(5.2F, 7, 3.9);
        System.out.println("Площадь треугольника 1 : " + triangle1.areaCalculation());
        System.out.println("Периметр треугольника 2 : " + triangle1.perimetr());


        Figure<Double, Double, Float> triangle2 = new Figure<>(9.7, 5.89, 14.9F);
        System.out.println("Площадь треугольника 2 : " + triangle2.areaCalculation());
        System.out.println("Периметр треугольника 2 : " + triangle2.perimetr());



    }

}
