/**
 * Name: Laya Dang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/10/2026
 * File Name: Customer.java
 * Description: Customer object to interace with legacy and modern system.
 */

package edu.bu.met.cs665;

public class Customer {
    private int customerId;

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }
}
