package com.company.Interfaces;

public interface Observable {
    void AddObserver(Observer observer);

    void NotifyObserver();

    void RemoveObserver(Observer observer);

}
