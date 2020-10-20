package com.company.Entities;

import com.company.Interfaces.Observer;

import java.util.ArrayList;

public class Cooker {
    public ArrayList<Order> readyOrders=new ArrayList<>();

    public void CookOrder(Order currentOrder) {
        readyOrders.add(currentOrder);
    }


}
