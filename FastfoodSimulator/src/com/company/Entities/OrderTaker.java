package com.company.Entities;

import com.company.Interfaces.Observable;
import com.company.Interfaces.Observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OrderTaker implements Observable {
    private List<Observer> observers;
    private ArrayList<Order> waitingOrders = new ArrayList<>();
    private ArrayList<Order> readyOrders = new ArrayList<>();

    public OrderTaker() {
        observers = new LinkedList<>();
    }

    @Override
    public void AddObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void NotifyObserver() {
        for (Observer observer : observers) {
            observer.Update(waitingOrders, readyOrders);
        }
    }

    @Override
    public void RemoveObserver(Observer observer) {
        observers.remove(observer);
    }

    public void TakeOrder(Customer customer) {
        waitingOrders.add(new Order(customer));
        NotifyObserver();
    }

    public void CookOrder(Cooker cooker) {
        if (!(waitingOrders.isEmpty())) {
            cooker.CookOrder(waitingOrders.get(0));
            waitingOrders.remove(0);
            this.readyOrders = cooker.readyOrders;
            NotifyObserver();
        }
    }
}