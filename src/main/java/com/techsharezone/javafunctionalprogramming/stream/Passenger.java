package com.techsharezone.javafunctionalprogramming.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.List;


@Builder
@AllArgsConstructor
@Getter
@Setter
public class Passenger
{
    private String fullName;
    private Integer age;
    private List<Bag> bags;

}
