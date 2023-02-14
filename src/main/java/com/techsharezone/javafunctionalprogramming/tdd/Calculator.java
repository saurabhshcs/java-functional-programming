package com.techsharezone.javafunctionalprogramming.tdd;

import java.util.Optional;

public class Calculator
{
    public Optional<Integer> sum(Integer i, Integer x)
    {
        return Optional.ofNullable( i + x);
    }
}
