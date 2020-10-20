package com.company;

import com.company.Entities.Cooker;
import com.company.Entities.OrderTaker;
import com.company.Interfaces.Observer;

public class MyThread1 extends Thread{
    int time1;
    OrderTaker orderTaker;
    Cooker cooker;

    MyThread1(int time1, OrderTaker orderTaker, Cooker cooker) {
        this.time1 = time1;
        this.orderTaker = orderTaker;
        this.cooker=cooker;
    }

    public void run() {
        while (true) {
        orderTaker.CookOrder(cooker);
            try {
                Thread.sleep(time1*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
