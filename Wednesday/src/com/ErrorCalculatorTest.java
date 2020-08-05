package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ErrorCalculatorTest {
    @Test
    void sum() {
        ErrorCalculator Sum = new ErrorCalculator();
        double a = Sum.sum(1,2);
        assertEquals(3, a);
    }

    @Test
    void sub() {
        ErrorCalculator Sub = new ErrorCalculator();
        double a = Sub.sub(2,1);
        assertEquals(1, a); //error
    }

    @Test
    void mul() {
        ErrorCalculator Mul = new  ErrorCalculator();
        double a = Mul.mul(1,2);
        assertEquals(2, a);
    }

    @Test
    void div() {
        ErrorCalculator Div = new  ErrorCalculator();
        double a = Div.div(2,2);
        assertEquals(1, a); // error
    }
}