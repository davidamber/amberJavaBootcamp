package com.example.demo;

import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Store implements Serializable {
    private int store_id;


    private String name;
    private String city;
    private String state;

    // No arg constructor
    public Store() {

    }

    public Store(int store_id, String name, String city, String state) {
        this.store_id =store_id;
        this.name =name;
        this.city =city;
        this.state =state;
    }

    // Getter for store id
    public int getStore_id() {
        return store_id;
    }

    // Setter for store id
    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}