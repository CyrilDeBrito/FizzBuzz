package com.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    // Test only they Bundary(fr : extreme) case

    @Test
    public void shouldReturnOneIfNumberIsOne() {
        assertEquals("1", fizzBuzz.generate(1, 1));
    }

    @Test
    public void shouldReturnTwoIfNumberIsTwo() {
        assertEquals("2", fizzBuzz.generate(2, 2));
    }

    @Test
    public void shouldReturnFizzIfNumberIsThree() {
        assertEquals("Fizz", fizzBuzz.generate(3, 3));
    }

    @Test
    public void shouldReturnFizzIfNumberIsSix() {
        assertEquals("Fizz", fizzBuzz.generate(6, 6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIsFive() {
        assertEquals("Buzz", fizzBuzz.generate(5, 5));
    }

    @Test
    public void shouldReturnBuzzIfNumberIsTen() {
        assertEquals("Buzz", fizzBuzz.generate(10, 10));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIsFifteen() {
        assertEquals("FizzBuzz", fizzBuzz.generate(15, 15));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIsThirty() {
        assertEquals("FizzBuzz", fizzBuzz.generate(30, 30));
    }

    // 2 parameters here
    @Test
    public void shouldReturnOneTwoIfNumberAreOneandTwo() {
        assertEquals("12", fizzBuzz.generate(1, 2));
    }

    @Test
    public void shouldReturnOneTwoFizzIfNumberAreOneTwoThree() {
        assertEquals("12Fizz", fizzBuzz.generate(1, 3));
    }

    @Test
    public void shouldReturnOneTwoFizzFourBuzzIfNumberAreOneToFive() {
        assertEquals("12Fizz4Buzz", fizzBuzz.generate(1, 5));
    }

    @Test
    public void ShouldReturnOneToFifteenIfNumerAreOneToFifteen() {
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz", fizzBuzz.generate(1, 15));
    }
}
