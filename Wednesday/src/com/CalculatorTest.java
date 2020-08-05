package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void sum() {
        Calculator Sum = new Calculator();
        double a = Sum.sum(1,2);
        assertEquals(3, a);
    }

    @Test
    void sub() {
        Calculator Sub = new Calculator();
        double a = Sub.sub(2,1);
        assertEquals(1, a);
    }

    @Test
    void mul() {
        Calculator Mul = new Calculator();
        double a = Mul.mul(1,2);
        assertEquals(2, a);
    }

    @Test
    void div() {
        Calculator Div = new Calculator();
        double a = Div.div(2,1);
        assertEquals(2, a);
    }
}