package com.example.union;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator cal;

    @BeforeEach
    public void setup(){
        cal = new Calculator();
    }

    @Test
    public void add(){
        cal.add(1, 2);

        assertThat(cal.add(1,2)).isEqualTo(3);
    }

    @Test
    public void subtract(){
        assertThat(cal.subtract(2,1)).isEqualTo(1);
    }
}
