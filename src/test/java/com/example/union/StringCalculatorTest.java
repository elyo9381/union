package com.example.union;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup(){
        cal = new StringCalculator();
    }

    @Test
    @DisplayName("add_null_또는_빈문자")
    public void addNullOrEmptyString() {
        assertThat(cal.add(null)).isEqualTo(0);
        assertThat(cal.add("")).isEqualTo(0);
    }


    @Test
    @DisplayName("문자숫자가 왔을때 add")
    public void addJustIntNum() {
        assertThat(cal.add("1")).isEqualTo(1);
    }


    @Test
    @DisplayName("숫자 두개 쉼표  구분자")
    public void addDelimeter() {
        assertThat(cal.add("1,2,3")).isEqualTo(6);
    }

    @Test
    @DisplayName("구분자가 여러개 ")
    public void delemeterMore() {
        assertThat(cal.add("1,2:3")).isEqualTo(6);
    }

    @Test
    @DisplayName("문자 사이에 '₩n' or '//' 등이 올때")
    public void spectialCase() {
        assertThat(cal.add("//;\n1;2;3")).isEqualTo(6);
    }

}