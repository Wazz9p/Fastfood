package com.company.Entities;

public class Order {
    private String name;
    private String id;

    public String getName() {
        return name + id;
    }

    public Order(Customer customer) {

        this.name = customer.getName();
        id = " #" + (Math.random() * 200 + 1);
    }
}
