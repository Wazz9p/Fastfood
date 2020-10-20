package com.company.Entities;

import com.company.Interfaces.Observer;

import java.util.ArrayList;

public class CurrentOrdersDisplay implements Observer {
    ArrayList<Order> waitingOrders;
    ArrayList<Order> readyOrders;

    @Override
    public void Update(ArrayList a,ArrayList b) {
        waitingOrders=a;
        readyOrders=b;
        Display();
    }

    void Display() {
        System.out.println("Ожидающие заказы:");
        for (Order o : waitingOrders) {
            System.out.println(o.getName() + " ");
        }
        System.out.println("Готовые заказы:");
        for (Order o : readyOrders) {
            System.out.println(o.getName()+" ");
        }
    }
}
