package com.company.Entities;

import com.company.Interfaces.Observer;

import java.util.ArrayList;

public class Customer {
    private String name;
    public Customer(String name)
    {
           this.name=name;
    }
    public String getName() {
        return this.name;
    }
}
