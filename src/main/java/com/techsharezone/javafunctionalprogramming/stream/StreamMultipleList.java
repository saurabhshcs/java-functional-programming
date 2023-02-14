package com.techsharezone.javafunctionalprogramming.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMultipleList
{
    public static void main(String[] args)
    {
        Bag bag1 = Bag.builder()
                .id(1)
                .color("RED")
                .weight(BigDecimal.TEN)
                .build();
        Bag bag2 = Bag.builder()
                .id(2)
                .color("GREEN")
                .weight(BigDecimal.ONE)
                .build();
        Bag bag3 = Bag.builder()
                .id(3)
                .color("BLUE")
                .weight(BigDecimal.TEN)
                .build();
        List<Bag> bagsBundleOne = new ArrayList<>();
        bagsBundleOne.add(bag1);
        bagsBundleOne.add(bag2);

        List<Bag> bagsBundleTwo = new ArrayList<>();
        bagsBundleTwo.add(bag2);
        bagsBundleTwo.add(bag3);

        List<Bag> bagsBundleThree = new ArrayList<>();
        bagsBundleThree.add(bag1);
        bagsBundleThree.add(bag3);

        Passenger passengerOne = Passenger.builder()
                .fullName("Galaxy")
                .age(2)
                .bags(bagsBundleOne)
                .build();

        Passenger passengerTwo = Passenger.builder()
                .fullName("Galaxy")
                .age(2)
                .bags(bagsBundleTwo)
                .build();
        Passenger passengerThree = Passenger.builder()
                .fullName("Galaxy")
                .age(2)
                .bags(bagsBundleThree)
                .build();

        List<Passenger> passengerGroup1 = new ArrayList<>();
        passengerGroup1.add(passengerThree);
        passengerGroup1.add(passengerOne);

        List<Passenger> passengerGroup2 = new ArrayList<>();
        passengerGroup1.add(passengerOne);
        passengerGroup1.add(passengerTwo);

        List<Passenger> passengerGroup3 = new ArrayList<>();
        passengerGroup1.add(passengerThree);
        passengerGroup1.add(passengerTwo);

        Flight flightOne = Flight.builder()
                .destination("LHR")
                .source("IND")
                .flightNumber("IN-302")
                .passengers(passengerGroup1).build();

        Flight flightTwo = Flight.builder()
                .destination("LHR")
                .source("DXB")
                .flightNumber("DXB-12")
                .passengers(passengerGroup2).build();

        Flight flightThree = Flight.builder()
                .destination("CDG")
                .source("LHR")
                .flightNumber("AF-502")
                .passengers(passengerGroup3).build();

        List<Flight> flights = new ArrayList<>();
        flights.add(flightOne);
        flights.add(flightTwo);
        flights.add(flightThree);

        List<Bag> bags = new ArrayList<>();

        for (var flight : flights)
        {
            for (var passenger : flight.getPassengers())
            {
                for (var bag : passenger.getBags())
                {
                    bags.add(bag);
                }
            }
        }

        flights.stream()
                .forEach(flight -> flight.getPassengers().stream()
                        .forEach(passenger -> passenger.getBags().stream()
                                .forEach(bag ->
                                {
                                    bags.add(bag);
                                })));
        bags.stream().forEach(System.out::println);

    }
}
