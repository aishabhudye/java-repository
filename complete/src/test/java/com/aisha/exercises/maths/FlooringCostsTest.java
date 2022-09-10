package com.aisha.exercises.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlooringCostsTest {

    private final FlooringCosts flooringInputs = new FlooringCosts();

    @Test
    public void test_scenario_1(){

        assertEquals(150.00,flooringInputs.flooringCosts(5.0F,3.0F));
    }

    @Test
    public void test_scenario_2(){
        assertEquals(200.00,flooringInputs.flooringCosts(5.0F,4.0F));
    }

    @Test
    public void test_scenario_3(){
        assertEquals(60.00,flooringInputs.flooringCosts(3.0F,2.0F));
    }

    @Test
    public void test_scenario_4(){
        assertEquals(0.00,flooringInputs.flooringCosts(6.0F,5.0F));
    }

}