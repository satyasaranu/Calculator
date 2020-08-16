package com.veritis;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void Addition() {
        Calculator myCal = new Calculator();
        assertEquals(10,myCal.Addition(5,5));
    }

    @Test
     public void Subtraction() {
        Calculator myCal = new Calculator();
        assertEquals(10,myCal.Subtraction(15,5));
    }
}