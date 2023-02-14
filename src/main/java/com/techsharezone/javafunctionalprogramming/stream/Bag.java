package com.techsharezone.javafunctionalprogramming.stream;

import lombok.*;

import java.math.BigDecimal;


@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Bag
{
    private Integer id;
    private BigDecimal weight;
    protected String color;
}
