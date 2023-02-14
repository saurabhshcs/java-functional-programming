package com.techsharezone.javafunctionalprogramming.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.List;


@Builder
@Getter
@Setter
@AllArgsConstructor
class Flight
{
    private String flightNumber;
    private String destination;
    private String source;
    private List<Passenger> passengers;
}
