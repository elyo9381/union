package com.example.union;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void add(){
        Calculator cal = new Calculator();
        cal.add(1, 2);

        assertThat(cal.add(1,2)).isEqualTo(3);
    }

    @Test
    public void subtract(){
        Calculator calculator = new Calculator();
        assertThat(calculator.subtract(2,1)).isEqualTo(1);
    }
}
