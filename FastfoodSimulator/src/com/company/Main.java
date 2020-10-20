package com.company;

import com.company.Entities.Cooker;
import com.company.Entities.CurrentOrdersDisplay;
import com.company.Entities.Customer;
import com.company.Entities.OrderTaker;
import com.company.Interfaces.Observer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OrderTaker orderTaker = new OrderTaker();
        Observer ordersDisplay = new CurrentOrdersDisplay();
        Cooker cooker = new Cooker();
        Scanner scanner = new Scanner(System.in);

        orderTaker.AddObserver(ordersDisplay);
        System.out.println("Введите интервал поступления заказов:");
        int time = scanner.nextInt();
        System.out.println("Введите время готовки заказов:");
        int time1 = scanner.nextInt();

        MyThread t1 = new MyThread(time, orderTaker);
        MyThread1 t2 = new MyThread1(time1, orderTaker, cooker);

        t1.start();
        t2.start();
    }
}
