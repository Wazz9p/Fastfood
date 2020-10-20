package com.company;

import com.company.Entities.Cooker;
import com.company.Entities.CurrentOrdersDisplay;
import com.company.Entities.Customer;
import com.company.Entities.OrderTaker;
import com.company.Interfaces.Observer;

import java.util.Scanner;

public class MyThread extends Thread {
    int time1;
    OrderTaker orderTaker;
    MyThread(int time1 ,OrderTaker orderTaker) {
        this.time1=time1;
        this.orderTaker=orderTaker;
    }

    public void run() {
        while (true) {
            Customer customer = new Customer("");
            orderTaker.TakeOrder(customer);
            try {
                Thread.sleep(time1*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
