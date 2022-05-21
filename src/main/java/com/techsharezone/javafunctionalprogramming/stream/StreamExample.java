package com.techsharezone.javafunctionalprogramming.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Builder
class Order
{
    private Integer id;
    private String orderNumber;
    private Collection<OrderEntries> entries;
}

@Getter
@Setter
@AllArgsConstructor
@Builder
class OrderEntries
{
    private Integer id;
    private String productNummber;

}

@Getter
@Setter
@Builder
@AllArgsConstructor
class Product
{
    private Integer id;
    private String name;
    private BigDecimal price;
}
public class StreamExample
{
    public static void main(String[] args)
    {
        OrderEntries orderEntriesOne = OrderEntries.builder()
                                        .id(1)
                                        .productNummber("TSZ001")
                                        .build();
        OrderEntries orderEntriesTwo = OrderEntries.builder()
                                        .id(2)
                                        .productNummber("TSZ002")
                                        .build();
        OrderEntries orderEntriesThree = OrderEntries.builder()
                                        .id(3)
                                        .productNummber("TSZ003")
                                        .build();

        List entries = new ArrayList();
        entries.add(orderEntriesOne);
        entries.add(orderEntriesTwo);
        entries.add(orderEntriesThree);

        Order order = Order.builder()
                .id(1)
                .orderNumber("OLX-001")
                .entries(entries).build();


        System.out.println(order.getEntries().stream()
                .filter( product -> product.getProductNummber().equalsIgnoreCase("TSZ002"))
                .findAny().get().getProductNummber());

    }
}
