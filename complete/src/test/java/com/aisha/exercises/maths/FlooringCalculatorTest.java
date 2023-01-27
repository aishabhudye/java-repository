package com.aisha.exercises.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlooringCalculatorTest {

    private final FlooringCostCalculator calculator = new FlooringCostCalculator();

    @Test
    public void test_scenario_1(){

        Flooring flooring = new Flooring();
        flooring.setLength(5.0F);
        flooring.setWidth(3.0F);
        //flooring.setLength(5.5F); //This breaks immutability principle
        assertEquals(150.00, flooring.costs());
    }

    @Test
    public void test_scenario_2(){
        Flooring flooring = new Flooring(5.0F, 4.0F);
        assertEquals(200.00, flooring.costs());
    }

    @Test
    public void test_scenario_3(){
        Flooring flooring = new Flooring();
        flooring.setLength(3.0F);
        flooring.setWidth(2.0F);
        assertEquals(60.00,flooring.costs());
    }

    @Test
    public void test_scenario_4(){
        Flooring flooring = new Flooring(6.0F,5.0F);
        assertEquals(0.00,flooring.costs());
    }

}