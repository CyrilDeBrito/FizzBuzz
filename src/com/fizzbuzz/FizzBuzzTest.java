package com.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void shouldReturnOneIfNumberIsOne() {
        assertEquals("1", new FizzBuzz().generate(1));
    }

    @Test
    public void shouldReturnTwoIfNumberIsTwo(){
        assertEquals("2", new FizzBuzz().generate(2));
    }
}