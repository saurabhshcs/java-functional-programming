package com.techsharezone.javafunctionalprogramming.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{

    @InjectMocks
    private Calculator calculator = new Calculator();

    @BeforeEach
    void setUp()
    {
    }

    @Test
    public void shouldReturnSumWhenArgumentsAreTwoPositiveInteger()
    {
        Optional<Integer> sum =  calculator.sum(2, 2);
        assertEquals(sum.get(), 4);
    }

    @Test
    public void shouldNotReturnSumWhenArgumentsAreNullOrEmpty()
    {
        Optional<Integer> sum =  calculator.sum(null, 2);
        assertEquals(sum.get(), NullPointerException.class);
    }
}
